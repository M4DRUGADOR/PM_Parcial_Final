/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Mago extends Personaje{
    private int hechizoVida;
    
    public Mago(String nombre, int nivel, double vida, int hechizoVida){
        super(nombre,nivel,vida);
        this.hechizoVida=hechizoVida;
    }

    public int getHechizoVida() {
        return hechizoVida;
    }

    public void setHechizoVida(int hechizoVida) {
        this.hechizoVida = hechizoVida;
    }
    
    public void sanar(Personaje mago){
        mago.setVida(mago.getVida()+this.getHechizoVida());
    }
}
