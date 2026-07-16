package com.petconnect;

public class PetConnect {

    public static void main(String[] args) {

        Conexion.conectar();

        Usuario usuario1 = new Usuario();

        usuario1.nombre = "Andrea Bautista";
        usuario1.correo = "andrea@email.com";

        Mascota mascota1 = new Mascota();

        mascota1.setNombre("Max");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(3);
        mascota1.setRaza("Labrador");
        mascota1.setSexo("Macho");
        mascota1.setColor("Negro");
        mascota1.setIdUsuario(1);
        
        MascotaDAO mascotaDAO = new MascotaDAO();
        mascotaDAO.insertarMascota(mascota1);

        System.out.println("====================================");
        System.out.println("      PROYECTO PETCONNECT");
        System.out.println("====================================");

        System.out.println("=== DATOS DEL USUARIO ===");
        System.out.println("Nombre: " + usuario1.nombre);
        System.out.println("Correo: " + usuario1.correo);

        System.out.println();

        System.out.println("=== DATOS DE LA MASCOTA ===");
        System.out.println("Nombre: " + mascota1.getNombre());
        System.out.println("Especie: " + mascota1.getEspecie());
        System.out.println("Edad: " + mascota1.getEdad());

        System.out.println("====================================");
        System.out.println("FIN DE LA EJECUCIÓN");
        System.out.println("====================================");

    }
}