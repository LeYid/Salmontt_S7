/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package data;

import model.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author camil
 */
public class GestorUnidades {
    
    private final List<UnidadOperativa> unidades; // Lista privada que solo contiene objetos del tipo UnidadOperativa y sus subclases
    
    public GestorUnidades() {
        this.unidades = new ArrayList<>(); // Creamos una lista llamada "unidades"
        cargarUnidadesIniciales();
    }

    private void cargarUnidadesIniciales() { // Cargamos la información a la consola
        
        
        // Centros de Cultivo (id, tipoAgua, nombre)
        unidades.add(new CentroCultivo(001,"Salada","CC Chiloe"));
        unidades.add(new CentroCultivo(002,"Salada","CC Magallanes"));
        unidades.add(new CentroCultivo(003, "Dulce","CC Villarrica"));
        unidades.add(new CentroCultivo(004,"Dulce","CC Puerto Varas"));
        unidades.add(new CentroCultivo(005,"Dulce","CC Puerto Montt"));
        
        // Plantas de Proceso(capacidadProceso, id, nombre)
        unidades.add(new PlantaProceso(5000, 200, "Planta Castro"));
        unidades.add(new PlantaProceso(7500, 201, "Planta Quellon"));
        
        // Clase mixta CentroCultivoPlanta (capacidadProceso, tipoAgua, id, nombre)
        unidades.add(new CentroCultivoPlanta("Dulce", 7500, 006, "CP Aysen"));
        unidades.add(new CentroCultivoPlanta("Dulce", 7500, 006, "CP Antartica"));
        
        System.out.println("");
        System.out.println("\nInformativo Plantas y Centros de Cultivo salmonera Salmontt\n");
        System.out.println("\n[Se cargaron " + unidades.size() + " unidades operativas]"); // Se comienza informando la cantidad de "unidades" cargadas en el sistema
    }    
    
    
    public void mostrarInformacion() { // Mostramos información al usuario de los valores cargados en la lista a través de la consola con el método polifórmico "mostrarInformacion()
        
      
        System.out.println("\n---CENTROS DE CULTIVO---\n"); {   // 1. Centros de Cultivo
        
        for (UnidadOperativa u : unidades) {
            if(u instanceof CentroCultivo) {
                u.mostrarInformacion();
            }
        }
    }
            System.out.println("\n=====================================\n"); // Generamos un espaciado para una lectura armónica
            
        
        System.out.println("---PLANTAS DE PROCESO---\n"); { // 2. Planta Proceso
        
            for (UnidadOperativa u :unidades) {
            if(u instanceof PlantaProceso) {
                u.mostrarInformacion();
                
            }
          }
        }
        
        System.out.println("\n=====================================\n"); // Generamos nuevamente un espaciado para una lectura armónica
        
        
        System.out.println("\n---PROCESO DE CULTIVO PLANTA---\n"); // 3. Clase mixta (CentroCultivo + PlantaProceso)
        
        for(UnidadOperativa u : unidades) {
            if(u instanceof CentroCultivoPlanta) {
                u.mostrarInformacion();
            }
        } 
        
        System.out.println("\n=====================================\n"); // Generamos un tercer y último espaciado para una lectura armónica
        
        System.out.println("\n---Fin del documento---\n");
    }
}


