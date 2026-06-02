class Personaje:
    def __init__(self, nombre, nivel, vida):
        self.nombre = nombre
        self.nivel = nivel
        self.vida = vida

class Guerrero(Personaje):
    def __init__(self, nombre, nivel, vida, ataque_espada):
        super().__init__(nombre, nivel, vida)
        self.ataque_espada = ataque_espada

class Mago(Personaje):
    def __init__(self, nombre, nivel, vida, hechizo_vida):
        super().__init__(nombre, nivel, vida)
        self.hechizo_vida = hechizo_vida

class Arquero(Personaje):
    def __init__(self, nombre, nivel, vida, veneno):
        super().__init__(nombre, nivel, vida)
        self.veneno = veneno