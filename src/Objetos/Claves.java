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
    String id ="";
    
    public Claves(){}

    public Claves(String Clave, ArrayList contenido, String id) {
        this.Clave = Clave;
        this.contenido = contenido;
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
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
