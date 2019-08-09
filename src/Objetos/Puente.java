/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chriss Ramos
 */
public class Puente {
    public static String variableConsola = "";
    public static ArrayList<Claves> arrClaves = new ArrayList();
    public static Claves c = new Claves();
    
    public static void buscarClave(String contenido, int posicion){
        int nueva = posicion-1;
        JOptionPane.showMessageDialog(null, "Se Agregara: " + contenido + "En posicion" + nueva );
        
        Claves c = (Claves) arrClaves.get(nueva);
        JOptionPane.showMessageDialog(null, "Se encontro la clave: " + c.getClave());
        c.contenido.add(contenido);
        
        
    
    }
    public static void mostrarDatos(){
        Claves c = (Claves) arrClaves.get(0);
        ArrayList lista = c.getContenido();
        JOptionPane.showMessageDialog(null, "En Clave:" + c.getClave() + " hay " + lista.size());
    }
    
}
