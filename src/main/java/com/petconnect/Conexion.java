package com.petconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/petconnect";
    private static final String USER = "root";

    // ESCRIBE AQUÍ TU CONTRASEÑA DE MYSQL
    private static final String PASSWORD = "Andrea2026*";

    public static Connection conectar() {

        Connection conexion = null;

        try {

            conexion = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("✅ Conexión exitosa a MySQL");

        } catch (SQLException e) {

            System.out.println("❌ Error de conexión");
            System.out.println(e.getMessage());

        }

        return conexion;

    }

}