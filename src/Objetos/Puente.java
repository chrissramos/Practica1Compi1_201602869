/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Analizador.Lexico;
import Analizador.Sintactico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chriss Ramos
 */
public class Puente {
    
    public static String variableConsola = "";
    public static String contenidoDat = "";
    public static ArrayList<Claves> arrClaves = new ArrayList();
    
    public static Claves c = new Claves();
    
    public static void buscarClave(String contenido, int posicion){
        int nueva = posicion-1;
        JOptionPane.showMessageDialog(null, "Se Agregara: " + contenido + "En posicion" + nueva );
        
        Claves c = (Claves) arrClaves.get(nueva);
        JOptionPane.showMessageDialog(null, "Se encontro la clave: " + c.getClave());
        c.contenido.add(contenido);
        
        //atributo id de claves sera el id de la variable a la hora de ser credo
    
    }
    public static void mostrarDatos(){
        Claves c = (Claves) arrClaves.get(0);
        ArrayList lista = c.getContenido();
        JOptionPane.showMessageDialog(null, "En Clave:" + c.getClave() + " hay " + lista.size());
    }
    
    
    public static void analizarDatos(String identificador, String cadena){
        String ruta = cadena.replace("\"", "");
        File archivo = new File(ruta);
        FileInputStream entrada;
        JOptionPane.showMessageDialog(null, "Creara: " + identificador + " con cadena:" + cadena);
        
        String contenido = "";
        try{
            entrada=new FileInputStream(archivo);
            int ascii;
            while ((ascii=entrada.read())!=-1) {
                char caracter=(char)ascii;
                contenido+=caracter;
            }
        }catch(Exception e){
        
        }
        
        
        System.err.println(contenido);
        
        /*
        try{
            Sintactico sin = new Sintactico(
                new Lexico(new BufferedReader (new StringReader(contenido))));
            sin.parse();
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }
    
}
