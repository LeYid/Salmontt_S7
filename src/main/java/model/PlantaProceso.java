/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

/**
 *
 * @author camil
 */


public class PlantaProceso extends UnidadOperativa { // Herencia de super clase Unidad Operativa
    private double capacidadProceso; // private = solo la clase lo puede ver

    
    public PlantaProceso(double capacidadProceso, int id, String nombre) {
        super(id, nombre);
        this.capacidadProceso = capacidadProceso;
    }

    
   
    // Get & Set
    public double getCapacidadProceso() {return capacidadProceso;}
    public void setCapacidadProceso(double capacidadProceso) {this.capacidadProceso = capacidadProceso;}

    
    
    
    @Override
    public void mostrarInformacion() { // sobrescribimos lo que se muestra por la consola agregando la variable "capacidadProceso"
        super.mostrarInformacion(); // super = muestra nombre + id de la clase padre UnidadOperativa
        System.out.println("Capacidad de proceso: " + capacidadProceso);
    }
    
    
}
