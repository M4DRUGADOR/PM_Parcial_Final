package view;

import java.util.Scanner;
import controller.JuegoController;
import db.Conexion;
import model.Arquero;
import model.Guerrero;
import model.Mago;
import model.Personaje;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JuegoController jc = new JuegoController();
        db.Conexion.conectar();
        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Crear un Personaje");
            System.out.println("2. Ver mis personajes");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Creea tu personaje ---");
                    System.out.println("Ingrese el nombre del personaje: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el nivel del personaje: ");
                    int nivel = sc.nextInt();
                    System.out.println("Ingrese la vida de su personaje: ");
                    double vida = sc.nextDouble();
                    System.out.println("¿A que clase pertenece?: ");
                    System.out.println("1. Guerrero");
                    System.out.println("2. Mago");
                    System.out.println("3. Arquero");
                    int tipoClase = sc.nextInt();
                    switch (tipoClase){
                        case 1:
                            System.out.println("Ingrese el dano de espada: ");
                            int ataque = sc.nextInt();
                            Guerrero nuevoGuerrero = new Guerrero(nombre, nivel, vida, ataque); 
                            jc.agregarPersonaje(nuevoGuerrero);
                            System.out.println("Guerrero creado.");
                        break;
                        case 2:
                            System.out.println("Ingrese el valor de curacion: ");
                            int hechizoVida = sc.nextInt();
                            Mago nuevoMago = new Mago(nombre, nivel, vida, hechizoVida); 
                            jc.agregarPersonaje(nuevoMago);
                            System.out.println("Guerrero creado.");
                        break;
                        case 3: 
                            Arquero nuevoArquero = new Arquero(nombre, nivel, vida, 0); 
                            jc.agregarPersonaje(nuevoArquero);
                            System.out.println("Arquero creado."); 
                        break;
                    }

                case 2:
                    System.out.println("\n--- Lista de Personajes ---");
                    int cantidad = jc.getListaPersonajes().size();
                    
                    if (cantidad == 0) {
                        System.out.println("aun no tienes personajes creados.");
                    } else {
                        for (int i = 0; i < cantidad; i++) {
                            Personaje p = jc.obtenerPersonaje(i);
                            System.out.println((i + 1) + ". " + p.getNombre() + " - Nivel: " + p.getNivel() + " - Vida: " + p.getVida());
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Chao");
                    break;  
            }

        } while (opcion != 0); 
    }
}