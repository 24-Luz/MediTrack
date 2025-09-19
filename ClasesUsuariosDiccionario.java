
package meditrack.storage;
// Paquete separado para no interferir con el código anterior

/**
 * ClasesUsuariosDiccionario.java
 * Contiene las clases Usuario y Administrador
 * Ahora todo está listo para que se impriman bien los acentos en consola (UTF-8).
 */

public class ClasesUsuariosDiccionario {

    // ========================= CLASE USUARIO =========================
    public static class Usuario {
        private String idUsuario;
        private String nombreCompleto;
        private String correo;
        private String telefono;
        private String contrasena;
        private String rolUsuario;

        // Constructor por defecto
        public Usuario() {
            this.idUsuario = "";
            this.nombreCompleto = "";
            this.correo = "";
            this.telefono = "";
            this.contrasena = "";
            this.rolUsuario = "Usuario";
        }

        // Constructor con parámetros
        public Usuario(String idUsuario, String nombreCompleto, String correo,
                       String telefono, String contrasena, String rolUsuario) {
            this.idUsuario = idUsuario;
            this.nombreCompleto = nombreCompleto;
            this.correo = correo;
            this.telefono = telefono;
            this.contrasena = contrasena;
            this.rolUsuario = rolUsuario;
        }

        // Métodos principales
        public boolean registrarUsuario() {
            System.out.println("Usuario registrado: " + this.nombreCompleto + " (" + this.correo + ")");
            return true;
        }

        public boolean iniciarSesion(String correo, String contrasena) {
            boolean ok = this.correo.equals(correo) && this.contrasena.equals(contrasena);
            System.out.println("Intento de inicio de sesión para " + correo + ": " + (ok ? "Éxito" : "Fallido"));
            return ok;
        }

        public boolean recuperarContrasena() {
            System.out.println("Se ha enviado un enlace de recuperación a " + this.correo);
            return true;
        }

        public void cerrarSesion() {
            System.out.println("Sesión cerrada para: " + this.nombreCompleto);
        }

        @Override
        public String toString() {
            return "Usuario{id='" + idUsuario + "', nombre='" + nombreCompleto +
                    "', correo='" + correo + "', rol='" + rolUsuario + "'}";
        }
    }

    // ========================= CLASE ADMINISTRADOR =========================
    public static class Administrador extends Usuario {

        public Administrador() {
            super();
            setRolUsuario("Administrador");
        }

        public Administrador(String idUsuario, String nombreCompleto, String correo,
                             String telefono, String contrasena) {
            super(idUsuario, nombreCompleto, correo, telefono, contrasena, "Administrador");
        }

        // Métodos de administrador
        public void registrarMedico(String idMedico, String nombreMedico) {
            System.out.println("Administrador registró al médico: " + nombreMedico + " (ID: " + idMedico + ")");
        }

        public void eliminarMedico(String idMedico) {
            System.out.println("Administrador eliminó al médico con ID: " + idMedico);
        }

        public void reasignarCita(String idCita, String idMedicoNuevo) {
            System.out.println("Cita " + idCita + " reasignada al médico " + idMedicoNuevo);
        }

        public void asignarHorario(String idMedico, String horario) {
            System.out.println("Horario '" + horario + "' asignado al médico " + idMedico);
        }

        public void generarReporte(String tipoReporte) {
            System.out.println("Generando reporte: " + tipoReporte);
        }

        @Override
        public String toString() {
            return "Administrador{" + super.toString() + "}";
        }

        // Setter para rol (sobrescribimos para evitar errores)
        public void setRolUsuario(String rol) {
            super.setRolUsuario("Administrador");
        }
    }
}
