package com.petconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MascotaDAO {

    public void insertarMascota(Mascota mascota) {

        String sql = "INSERT INTO mascotas (id_usuario, nombre, especie, raza, sexo, edad_aprox, color) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, mascota.getIdUsuario());
            ps.setString(2, mascota.getNombre());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getSexo());
            ps.setInt(6, mascota.getEdad());
            ps.setString(7, mascota.getColor());

            ps.executeUpdate();

            System.out.println("Mascota registrada correctamente.");

        } catch (SQLException e) {

            System.out.println("Error al registrar la mascota.");
            System.out.println(e.getMessage());

        }

    }

}
