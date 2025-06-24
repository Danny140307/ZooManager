/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Utils.Persona;
import java.time.LocalDate;

/**
 *
 * @author danny
 */
public class Visitantes extends Persona {
    private String telefono;

    public Visitantes(String cedula, String nombreCompleto, LocalDate fechaNacimiento, String telefono) {
        super(cedula, nombreCompleto, fechaNacimiento);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void modificarTelefono(String nuevoTelefono) {
        
    }

    @Override
    public String toString() {
        return nombreCompleto + " (" + getEdad() + " años)";
    }
    
    
    
    
    
}
