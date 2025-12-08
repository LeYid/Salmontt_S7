/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

/**
 *
 * @author camil
 */
public class CentroCultivo extends UnidadOperativa {
    private String tipoAgua;

    // Generamos Constructor incluyendo atributos de la superclase con "super"
    public CentroCultivo(int id, String tipoAgua, String nombre) {
        super(id, nombre);
        this.tipoAgua = tipoAgua;
    }
    // Get & Set
    public String getTipoAgua() {return tipoAgua;}
    public void setTipoAgua(String tipoAgua) {this.tipoAgua = tipoAgua;}

 // Utilizamos generador Override para llamar al método mostrarInformación() de la clase padre (UniOpe)
    @Override
    public void mostrarInformacion() { 
        super.mostrarInformacion(); // imprime ID y nombre // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Tipo de agua: " + tipoAgua);
   
    }
}

    

