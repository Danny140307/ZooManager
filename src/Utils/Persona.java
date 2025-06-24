/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.LocalDate;

/**
 *
 * @author danny
 */
public abstract class Persona {
    
      protected String cedula;
    protected String nombreCompleto;
    protected LocalDate fechaNacimiento;

    public Persona(String cedula, String nombreCompleto, LocalDate fechaNacimiento) {
        if (!UtilDate.esFechaValida(fechaNacimiento)) {
            throw new IllegalArgumentException("La fecha de nacimiento es inválida");
        }
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return UtilDate.calcularEdad(this.fechaNacimiento);
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
