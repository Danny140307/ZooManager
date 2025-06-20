/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Student
 */
public class Animal {

    private String idAnimal;
    private String nombre;
    private String especie;
    private LocalDateTime fechas;
    private zonasZoo zonas;

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDateTime getFechas() {
        return fechas;
    }

    public zonasZoo getZona() {
        return zonas;
    }

    public void setFechas(LocalDateTime fechas) {
        this.fechas = fechas;
    }

    public void setZonas(zonasZoo zonas) {
        this.zonas = zonas;
    }

    public Animal(String idAnimal, String nombre, String especie, LocalDateTime fechas, String zona) {

        if (idAnimal != null && idAnimal.matches("^\\w{1}-\\d{4}$")) {
            this.idAnimal = idAnimal;
        }
        this.nombre = nombre;
        this.especie = especie;
        
        this.zonas = zonasZoo.ConservacionYRescate;
        if (fechas != null && fechas.isAfter(LocalDateTime.now())){
            this.fechas = fechas;
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", especie=" + especie + ", fechas=" + fechas + ", zonas=" + zonas + '}';
    }

}
