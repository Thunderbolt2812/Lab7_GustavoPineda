/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_gustavopineda;

/**
 *
 * @author Usuario
 */
public class Carros {
    private String placa;
    private String tamaño;
    private int puertas;
    private int suciedad;

    public Carros() {
    }

    public Carros(String placa, String tamaño, int puertas, int suciedad) {
        this.placa = placa;
        this.tamaño = tamaño;
        this.puertas = puertas;
        this.suciedad = suciedad;
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getSuciedad() {
        return suciedad;
    }

    public void setSuciedad(int suciedad) {
        this.suciedad = suciedad;
    }

    @Override
    public String toString() {
        return "Carro: " + placa;
    }
    
}
