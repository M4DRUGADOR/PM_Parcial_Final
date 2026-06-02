import sys
import os

# Esto es lo que soluciona los errores de importación
sys.path.append(os.path.dirname(os.path.abspath(__file__)))

from controller.juego_controller import JuegoController
from model.personaje import Guerrero, Mago, Arquero

controller = JuegoController()

def menu():
    while True:
        print("\n--- MENÚ PRINCIPAL ---")
        print("1. Crear Guerrero")
        print("2. Crear Mago")
        print("3. Crear Arquero")
        print("0. Salir")
        opcion = input("Elige una opción: ")

        if opcion == "0": break
        
        nombre = input("Nombre: ")
        nivel = int(input("Nivel: "))
        vida = float(input("Vida: "))

        if opcion == "1":
            ataque = int(input("Daño espada: "))
            controller.agregar_personaje(Guerrero(nombre, nivel, vida, ataque))
        elif opcion == "2":
            hechizo = int(input("Hechizo vida: "))
            controller.agregar_personaje(Mago(nombre, nivel, vida, hechizo))
        elif opcion == "3":
            controller.agregar_personaje(Arquero(nombre, nivel, vida, 0.15))

if __name__ == "__main__":
    menu()