package meditrack; 
// Indica que esta clase pertenece al paquete "meditrack"

/**
 * @author cristian andres
 * UsuariosModel.java
 * Contiene las clases Usuario y Administrador
 */

// ========================= CLASE USUARIO =========================
class Usuario {
    // ---------- Atributos privados (encapsulación) ----------
    private String idUsuario;      // Identificador único del usuario
    private String nombreCompleto; // Nombre completo del usuario
    private String correo;         // Correo electrónico
    private String telefono;       // Teléfono de contacto
    private String contrasena;     // Contraseña del usuario
    private String rolUsuario;     // Rol (Paciente, Médico, Administrador, etc.)

    // ---------- Constructor por defecto ----------
    public Usuario() {
        this.idUsuario = "";         
        this.nombreCompleto = "";    
        this.correo = "";            
        this.telefono = "";          
        this.contrasena = "";        
        this.rolUsuario = "Usuario"; // rol por defecto
    }

    // ---------- Constructor con parámetros ----------
    public Usuario(String idUsuario, String nombreCompleto, String correo, 
                   String telefono, String contrasena, String rolUsuario) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.rolUsuario = rolUsuario;
    }

    // ---------- Getters y Setters ----------
    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(String idUsuario) { this.idUsuario = idUsuario; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getRolUsuario() { return rolUsuario; }
    public void setRolUsuario(String rolUsuario) { this.rolUsuario = rolUsuario; }

    // ---------- Métodos de comportamiento ----------
    public boolean registrarUsuario() {
        System.out.println("Usuario registrado: " + this.nombreCompleto + " (" + this.correo + ")");
        return true; // Devuelve true indicando que se registró
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
class Administrador extends Usuario {

    // ---------- Constructor por defecto ----------
    public Administrador() {
        super(); // Llama al constructor de Usuario
        setRolUsuario("Administrador"); // Cambia el rol a "Administrador"
    }

    // ---------- Constructor con parámetros ----------
    public Administrador(String idUsuario, String nombreCompleto, String correo,
                         String telefono, String contrasena) {
        super(idUsuario, nombreCompleto, correo, telefono, contrasena, "Administrador");
    }

    // ---------- Métodos exclusivos del Administrador ----------
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
}
