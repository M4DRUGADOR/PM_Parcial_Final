/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Arquero extends Personaje{
    private double ataqueFlechaVeneno;
    
    public Arquero(String nombre, int nivel, double vida, int ataqueFlechaVeneno){
        super(nombre,nivel,vida);
        this.ataqueFlechaVeneno=0.15;
    }

    public double getAtaqueFlechaVeneno() {
        return ataqueFlechaVeneno;
    }

    public void setAtaqueFlechaVeneno(double ataqueFlechaVeneno) {
        this.ataqueFlechaVeneno = ataqueFlechaVeneno;
    }

    public void envenenar(Personaje enemigo){
        enemigo.setVida(enemigo.getVida()-(enemigo.getVida()*this.ataqueFlechaVeneno));
    }
}
