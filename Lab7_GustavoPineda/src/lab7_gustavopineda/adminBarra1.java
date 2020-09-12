/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_gustavopineda;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Usuario
 */
public class adminBarra1 extends Thread {
    private JProgressBar barra1;
    private boolean avanzar;
    private boolean vive;
    private int max;
    
    public adminBarra1(JProgressBar barra1,int max) {
        this.barra1 = barra1;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra1.setValue(barra1.getValue()+1);
                if(barra1.getValue()==max){
                    vive=false;
                    JOptionPane.showMessageDialog(null, "Simulacion terminada");
                }                
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
