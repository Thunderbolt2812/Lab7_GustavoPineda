/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_gustavopineda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class adminEmpleados {

    private ArrayList<Empleados> listaEmpleados = new ArrayList();
    private File archivo = null;

    public adminEmpleados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Empleado=" + listaEmpleados;
    }
    
    public void setEmpleados(Empleados b) {
        this.listaEmpleados.add(b);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public void cargarArchivo() {
        try {
            listaEmpleados = new ArrayList();
            Empleados temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleados) objeto.readObject()) != null) {
                        listaEmpleados.add(temp);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            }
        } catch (IOException | ClassNotFoundException ex) {
        }
    }

    @SuppressWarnings("UseSpecificCatch")
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Empleados t : listaEmpleados) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
