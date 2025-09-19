/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meditrack;

/**
 *
 * @author USER HP
 */
public class Cita {
    private String id_cita;
    private String fecha_cita;
    private String hora_cita;
    
    //Constructores
    public Cita (String ID_cita, String fecha, String hora) {
        this.id_cita = ID_cita;
        this.fecha_cita = fecha;
        this.hora_cita = hora;
    }
    
    //Metodos 
    public void comfirmar_cita () {
        System.out.println("El ID de su cita es: " + id_cita); 
        System.out.println("Su cita esta programada para la fecha: " + fecha_cita);
        System.out.println("A la hora: " + hora_cita);
        
    }
}
