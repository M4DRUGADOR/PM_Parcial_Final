package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/juego_rol_db";
    private static final String USUARIO = "root"; 
    private static final String PASSWORD = "maiaji3124487084"; 

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }
}