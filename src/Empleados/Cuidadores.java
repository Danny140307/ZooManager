/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import Animales.Animal;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Cuidadores extends empleado {
    private String especialidad;
    private String [] registro;
            
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String[] getRegistro() {
        return registro;
    }

    
    public void Alimentar(Animal idAnimal){
        for(int i=0;i<200;i++){
            if(registro[i] == null){
                registro[i] = "Alimento:" +idAnimal;
                break;
            }
        }
    }
    public void EstadoSalud(Animal idAnimal){
        for(int i=0;i<200;i++){
            if(registro[i] == null){
                registro[i] = "Se reviso la salud de :" +idAnimal;
                break;
            }
        }
    }
    
    public Cuidadores(String especialidad, int id, String nombre, LocalDate fecha, String telefono, double salario) {
        super(id, nombre, fecha, telefono, salario);
        this.especialidad = especialidad;
        this.registro = new String[200];
    }

    @Override
    public String toString() {
        return "Cuidadores{" + "especialidad=" + especialidad + '}';
    }
    
    
}
