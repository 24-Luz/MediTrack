/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author angie
 */
public class Estudiante { // se creo un javaclass es solo la prantilla
    
    private String nombre;
    private int edad;
    private String grado;
    
    // Constructores
    
    public Estudiante (String nombre, int edad, String grado){ // (constructor completo) el nombre del parametro puede ser diferente al atributo
        this.nombre = nombre; // en caso de que se le ponga otro nombre = "este"; cambiara
        this.edad = edad;
        this.grado = grado;
    }
    
    public Estudiante (String nombre, int edad){ // en caso de querer solo 2 parametros teniendo 3 atributos
        this.nombre = nombre; 
        this.edad = edad;
        this.grado = "Sin confirmar"; // Se agrega un dato al atributo que se mostrara en caso de que no se han ingresado
    }
    
    public Estudiante (String nombre){ 
        this.nombre = nombre; 
        this.edad = 0;
        this.grado = "Sin confirmar"; 
    }
    
    // Metodo - Sirve para mostrar info del estudiante
    
    public void mostrar_informacion (){ // no tiene metodo se deja el () vacio
        System.out.println ("Datos del estudiante: ");
        System.out.println ("Nombre: " + nombre);
        System.out.println ("Edad: " + edad);
        System.out.println ("Grado: " + grado);
    }
    public void saludar (){ 
        System.out.println ("Hola, soy " + nombre + " y estoy en el grado " + grado);
    }
}
