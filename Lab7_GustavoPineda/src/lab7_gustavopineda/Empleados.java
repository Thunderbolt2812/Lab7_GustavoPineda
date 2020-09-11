/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_gustavopineda;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Empleados extends Personas {
    private ArrayList<Carros> car;
    public Empleados() {
        super();
    }

    public Empleados(ArrayList<Carros> car) {
        this.car = car;
    }

    public Empleados(ArrayList<Carros> car, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.car = car;
    }

    public ArrayList<Carros> getCar() {
        return car;
    }

    public void setCar(ArrayList<Carros> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Empleado: " +super.getNombre()+" "+super.getApellido() ;
    }
    
}
