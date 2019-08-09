/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Chriss Ramos
 */
public class Claves {
    String Clave = "";
    ArrayList contenido = new ArrayList();
    
    public Claves(){}

    public Claves(String Clave, ArrayList contenido) {
        this.Clave = Clave;
        this.contenido = contenido;
    }
    
    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public ArrayList getContenido() {
        return contenido;
    }

    public void setContenido(ArrayList contenido) {
        this.contenido = contenido;
    }
    
}
