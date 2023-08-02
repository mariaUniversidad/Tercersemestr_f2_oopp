/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador_fase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nathalyparedes
 */
public class ConexionBD {
 
    private final String url = "jdbc:mysql://bfwpkqfepjxmy3c9lq9l-mysql.services.clever-cloud.com:3306/INTEGRADOR_SEGUNDAFASE_DB";
    private final String usuario = "upzkpud5rert38ou";
    private final String contraseña = "w6EIBraIE0wTlb8Koslb";
    private Connection conexion;

    public ConexionBD() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
