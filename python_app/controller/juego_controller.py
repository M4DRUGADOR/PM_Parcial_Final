from db.conexion import conectar
from model.personaje import Guerrero, Mago, Arquero

class JuegoController:  
    def __init__(self):
        self.lista_personajes = []

    def agregar_personaje(self, personaje):
        self.lista_personajes.append(personaje)
        
        # Determinar el tipo y el atributo especial
        tipo = ""
        atributo = 0
        if isinstance(personaje, Guerrero):
            tipo = "Guerrero"
            atributo = personaje.ataque_espada
        elif isinstance(personaje, Mago):
            tipo = "Mago"
            atributo = personaje.hechizo_vida
        elif isinstance(personaje, Arquero):
            tipo = "Arquero"
            atributo = personaje.veneno

        # Guardar en BD
        conexion = conectar()
        if conexion:
            cursor = conexion.cursor()
            sql = "INSERT INTO personajes (nombre, nivel, vida, tipo, atributo_especial) VALUES (%s, %s, %s, %s, %s)"
            cursor.execute(sql, (personaje.nombre, personaje.nivel, personaje.vida, tipo, atributo))
            conexion.commit()
            cursor.close()
            conexion.close()
            print("¡Personaje guardado en la Base de Datos! 💾")