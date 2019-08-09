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
    }
    
}
