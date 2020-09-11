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
public class Clientes extends Personas{
    private ArrayList<Carros> car2;

    public Clientes() {
        super();
    }

    public Clientes(ArrayList<Carros> car2) {
        this.car2 = car2;
    }

    public Clientes(ArrayList<Carros> car2, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.car2 = car2;
    }

    public ArrayList<Carros> getCar2() {
        return car2;
    }

    public void setCar2(ArrayList<Carros> car2) {
        this.car2 = car2;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.getNombre()+" "+super.getApellido();
    }
    
}
