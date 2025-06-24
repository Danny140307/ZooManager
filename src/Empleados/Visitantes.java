/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;

/**
 *
 * @author danny
 */
public class Visitantes {
    private String id;
    private String nombre;
    private String telefono;
    private LocalDate fecha;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}$")) {

            this.telefono = telefono;
        }
    }

    public Visitantes(String id, String nombre, String telefono, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Visitantes{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fecha=" + fecha + '}';
    }
    
    
}
