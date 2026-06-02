/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Guerrero extends Personaje {
    private int ataqueEspada;
    
    public Guerrero (String nombre, int nivel, double vida, int ataqueEspada){
        super(nombre,nivel,vida);  
        this.ataqueEspada=ataqueEspada;
    }

    public int getAtaqueEspada() {
        return ataqueEspada;
    }

    public void setAtaqueEspada(int ataqueEspada) {
        this.ataqueEspada = ataqueEspada;
    }
    
    public void atacar(Personaje enemigo){
       enemigo.setVida(enemigo.getVida()-this.ataqueEspada);
    }
}
