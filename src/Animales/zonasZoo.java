/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Student
 */
public enum zonasZoo {
    Graja("Granja"),
    Contacto("Contacto"),
    Alimentacion("Alimentacion"),
    ConservacionYRescate("Conservacion y Rescate"),
    TunelNocturno("Tunel Nocturno"),
    BiodivesidadLocal("Biodiversidad Local");
    
    private final String zonas;

    zonasZoo(String zonas){
        this.zonas = zonas;
    }
    
    public String getZonas() {
        return zonas;
    }

    @Override
    public String toString() {
        return "zonasZoo{" + "zonas=" + zonas + '}';
    }
    
    
    
}
