/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

/**
 *
 * @author camil
 */
public class CentroCultivoPlanta extends UnidadOperativa { 

// realicé una clase mixta para tener la opción de ingresar en GestorUnidades los 4 datos juntos 
    
    private final String tipoAgua;
    private final double capacidadProceso;

    public CentroCultivoPlanta(String tipoAgua, double capacidadProceso, int id, String nombre) {
        super(id, nombre);
        this.tipoAgua = tipoAgua;
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n+---Unidad Mixta---+");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de Agua: " + tipoAgua);
        System.out.println("Capacidad de Proceso" + capacidadProceso);
    }   
    
}
