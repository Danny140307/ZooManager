/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Guias extends empleado {
    private int[] idiomas;

    private String [] registroRecorrido;
    public int[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int[] idiomas) {
        this.idiomas = idiomas;
    }

    public String[] getRegistroRecorrido() {
        return registroRecorrido;
    }

    
    
    public Guias(int[] idiomas, int id, String nombre, LocalDate fecha, String telefono, double salario) {
        super(id, nombre, fecha, telefono, salario);
        this.idiomas = new int[15];
    }

 
    

    @Override
    public String toString() {
        return "Guias{" + "idiomas=" + idiomas + '}';
    }
    
    
}
