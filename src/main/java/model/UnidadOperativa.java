/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

/**
 *
 * @author camil
 */

public class UnidadOperativa { // Superclase o clase base (Herencia). Sus clases hijas son PlantaProceso y CentroCultivo
    
    // Creamos 2 objetos (String) y una variable (int)
    protected int id; // solo subclases lo pueden ver
    protected String nombre; // 2 atributos clase base

    public UnidadOperativa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;  
    }
    
// Constructores Getters & Setters (para leer o modificar ciertos atributos desde la clase principal)
    public int getId() {return id;}    
    public void setId(int id) {this.id = id;} // void almacena información entregada por el usuario

    public String getNombre() {return nombre; } // public muestra por consola la información del algoritmo
    public void setNombre(String nombre) {this.nombre = nombre;}

    
    // Override
    public void mostrarInformacion() {
        System.out.println("\n+---Unidad Operativa---+");
        System.out.println("ID: " + id);
        System.out.println("Nombre " + nombre);
    }

    
    
    
}
