/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Personaje {
    private String nombre;
    private int nivel;
    private double vida;
    
    public Personaje (String nombre, int nivel, double vida){
        this.nombre=nombre;
        setNivel(nivel);
        setVida(vida);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nuevoNivel) {
        if (nuevoNivel<1){
            this.nivel = 1;
        } else {
            this.nivel = nuevoNivel;
        }
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double nuevaVida) {
        if (nuevaVida<0){
            this.vida=0;
        } else {
        this.vida = nuevaVida;
    }
    }
}


