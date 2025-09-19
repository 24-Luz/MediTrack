/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meditrack;

/**
 *
 * @author USER HP
 */
public class MediTrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cita infoCita = new Cita("103-440", "27/09/2025", "2:30");
        
        infoCita.comfirmar_cita();
    }
    
}
