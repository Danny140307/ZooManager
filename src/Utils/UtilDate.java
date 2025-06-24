/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author danny
 */
public abstract class UtilDate {
    
        public static int calcularEdad(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser nula ni futura.");
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

        public static boolean esFechaValida(LocalDate fecha) {
        return fecha != null && !fecha.isAfter(LocalDate.now());
    }
         public static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        return calcularEdad(fechaNacimiento) >= 18;
    }
        
}
