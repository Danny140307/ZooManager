/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Student
 */
public class empleado {

    private int id;
    private String nombre;
    private LocalDate fecha;
    private String telefono;
    private double salario;
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSalario() {
        return salario;
    }

  

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("^\\d{2}-\\d{2}-\\d{2}-\\d{2}$")) {

            this.telefono = telefono;
        }
    }

    public void setSalario(double salario) {

        if (salario > 300000) {
            this.salario = salario;
        }
    }

    public empleado(int id, String nombre, LocalDate fecha, String telefono, double salario) {
        this.id = id;
        this.nombre = nombre;
        if(18<Period.between(fecha,LocalDate.now()).getYears()){
        this.fecha = fecha;
            
        }
        this.telefono = telefono;
        this.salario = salario;
    }

}
