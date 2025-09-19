package meditrack.storage;

import java.io.PrintStream;

public class MainDiccionario {
    public static void main(String[] args) throws Exception {
        // Forzar salida en UTF-8 (para que los acentos se vean bien en NetBeans/Windows)
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        // ================== Crear un usuario normal ==================
        ClasesUsuariosDiccionario.Usuario user1 =
                new ClasesUsuariosDiccionario.Usuario("U001", "Juan Perez",
                        "juan@example.com", "3123456789", "1234", "Paciente");

        // Registro de usuario
        user1.registrarUsuario(); // imprime dentro: "Usuario registrado: Juan Perez (juan@example.com)"

        // Inicio de sesión
        System.out.println("Intento de inicio de sesión para " + user1.getCorreo() + ": Éxito");
        boolean loginExitoso = user1.iniciarSesion("juan@example.com", "1234");
        System.out.println("Login exitoso? " + loginExitoso);

        // Recuperación de contraseña
        user1.recuperarContrasena(); // imprime dentro: "Se ha enviado un enlace de recuperación..."

        // Cierre de sesión
        user1.cerrarSesion(); // imprime dentro: "Sesión cerrada para: Juan Perez"

        // ================== Crear un administrador ==================
        System.out.println("----- Admin actions -----");
        ClasesUsuariosDiccionario.Administrador admin1 =
                new ClasesUsuariosDiccionario.Administrador("A001", "Admin NetBeats",
                        "admin@netbeats.com", "987654321", "admin123");

        admin1.registrarUsuario(); // imprime dentro: "Usuario registrado: Admin NetBeats..."

        // Mostrar rol
        System.out.println("Rol del admin: Administrador");

        // Acciones del administrador
        admin1.registrarMedico("M001", "Dra. Maria Gomez");
        admin1.asignarHorario("M001", "Lun-Vie 08:00-12:00");
        admin1.reasignarCita("C123", "M002");
        admin1.generarReporte("Reporte de Citas - Septiembre");

        // Mostrar administrador como objeto
        System.out.println("Mostrando admin como usuario: " + admin1);
    }
}
