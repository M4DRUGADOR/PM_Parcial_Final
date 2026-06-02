/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Personaje;

/**
 *
 * @author Usuario
 */
public class JuegoController {
    private ArrayList<Personaje> listaPersonajes;
    public JuegoController(){
        this.listaPersonajes=new ArrayList<>();
    }

    public ArrayList<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public void setListaPersonajes(ArrayList<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }
    
    
    //controladores
    
   public void agregarPersonaje(Personaje nuevoPersonaje){
      this.listaPersonajes.add(nuevoPersonaje);
      String sql = "INSERT INTO personajes (nombre, nivel, vida, tipo, atributo_especial) VALUES (?, ?, ?, ?, ?)";
        
        try (java.sql.Connection conexion = db.Conexion.conectar();
             java.sql.PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, nuevoPersonaje.getNombre());
            pstmt.setInt(2, nuevoPersonaje.getNivel());
            pstmt.setDouble(3, nuevoPersonaje.getVida());
                       if (nuevoPersonaje instanceof model.Guerrero) {
                pstmt.setString(4, "Guerrero");
                pstmt.setDouble(5, ((model.Guerrero) nuevoPersonaje).getAtaqueEspada());
            } else if (nuevoPersonaje instanceof model.Mago) {
                pstmt.setString(4, "Mago");
                pstmt.setDouble(5, ((model.Mago) nuevoPersonaje).getHechizoVida());
            } else if (nuevoPersonaje instanceof model.Arquero) {
                pstmt.setString(4, "Arquero");
                pstmt.setDouble(5, ((model.Arquero) nuevoPersonaje).getAtaqueFlechaVeneno());
            }
            
            pstmt.executeUpdate();
            System.out.println("Personaje guardado en la BD");
            
        } catch (java.sql.SQLException e) {
            System.out.println("Error al guardar en BD: " + e.getMessage());
        }
    }
   
   public Personaje obtenerPersonaje(int indice){
       return this.listaPersonajes.get(indice);
   }
} 

