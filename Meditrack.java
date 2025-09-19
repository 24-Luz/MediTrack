/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meditrack;

/**
 *
 * @author cristian andres
 */
public class Meditrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main.java
        // Este archivo contiene el método main (ejecutable)
         // ----- Crear un usuario tipo "Paciente" -----
        Usuario paciente = new Usuario(
            "U001",                // idUsuario
            "Juan Perez",          // nombreCompleto
            "juan@example.com",    // correo
            "3001234567",          // teléfono
            "miPass123",           // contraseña
            "Paciente"             // rol
        );

        // Registrar al usuario en el sistema
        paciente.registrarUsuario();

        // Intento de sesión con credenciales correctas
        boolean loginOk = paciente.iniciarSesion("juan@example.com", "miPass123");
        System.out.println("Login exitoso? " + loginOk);

        // Recuperar contraseña (simulación)
        paciente.recuperarContrasena();

        // Cerrar sesión
        paciente.cerrarSesion();

        System.out.println("----- Admin actions -----");

        // ----- Crear un usuario tipo "Administrador" -----
        Administrador admin = new Administrador(
            "A001",                 // idUsuario
            "Admin NetBeats",       // nombreCompleto
            "admin@netbeats.com",   // correo
            "3109998888",           // teléfono
            "adminPass!"            // contraseña
        );

        // Registrar administrador en el sistema
        admin.registrarUsuario(); 

        // Mostrar el rol
        System.out.println("Rol del admin: " + admin.getRolUsuario());

        // Acciones que solo un administrador puede hacer
        admin.registrarMedico("M001", "Dra. Maria Gomez");         // Registrar medico
        admin.asignarHorario("M001", "Lun-Vie 08:00-12:00");       // Asignar horario
        admin.reasignarCita("C123", "M002");                       // Reasignar cita a otro medico
        admin.generarReporte("Reporte de Citas - Septiembre");     // Generar reporte

        // Polimorfismo: tratar al administrador como si fuera un Usuario
        Usuario adminComoUsuario = admin;
        System.out.println("Mostrando admin como usuario: " + adminComoUsuario);
    }
    
}
