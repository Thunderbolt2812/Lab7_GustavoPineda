/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_gustavopineda;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ET implements Serializable{
    private String placa;
    private String tamaño;
    private int suciedad;
    private double max;
    
    private static final long SerialVersionUID=123L;

    public ET() {
    }

    public ET(String placa, String tamaño, int suciedad, double max) {
        this.placa = placa;
        this.tamaño = tamaño;
        this.suciedad = suciedad;
        this.max = max;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return placa;
    }
    
}
