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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

//imports para grafica
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author Chriss Ramos
 */
public class Puente {
    
    public static String variableConsola = "";
    public static String contenidoDat = "";
    public static String idTemp = "";
    public static ArrayList<Claves> arrClaves = new ArrayList();
    public static ArrayList<Variable> arrVariables = new ArrayList();
    
    public static Claves c = new Claves();
    
    public static void buscarClave(String contenido, int posicion){
        int nueva = posicion-1;
        //JOptionPane.showMessageDialog(null, "Se Agregara: " + contenido + "En posicion" + nueva );
        
        Claves c = (Claves) arrClaves.get(nueva);
        //JOptionPane.showMessageDialog(null, "Se encontro la clave: " + c.getClave());
        c.contenido.add(contenido);
        c.id = idTemp;
        
        //atributo id de claves sera el id de la variable a la hora de ser credo
        //FALTA VACIAR VARIABLE IDTEMP CUANDO SE TERMINA DE CREAR LA VARIABLE ARCHIVO
    }
    public static void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Arreglo claves tiene: "+arrClaves.size() );
        /*
        for (int i = 0; i < arrClaves.size(); i++) {
            Claves c = (Claves)arrClaves.get(i);
            JOptionPane.showMessageDialog(null, c.getClave());
        }*/
        
        Claves c = (Claves) arrClaves.get(0);
        Claves c2 = (Claves) arrClaves.get(1);
        Claves c3 = (Claves) arrClaves.get(2);
        
        ArrayList lista2 = c2.getContenido();
        ArrayList lista = c.getContenido();
        ArrayList lista3 = c3.getContenido();
        //JOptionPane.showMessageDialog(null, "En Clave:" + c.getClave() + " hay " + lista.size() + " pertenece a:" + c.getId());
        //JOptionPane.showMessageDialog(null, "En Clave:" + c2.getClave() + " hay " + lista2.size() + " pertenece a:" + c2.getId());
        //JOptionPane.showMessageDialog(null, "En Clave:" + c3.getClave() + " hay " + lista3.size() + " pertenece a:" + c3.getId());
        
        
    }
    
    
    public static void analizarDatos(String identificador, String cadena){
        idTemp = identificador;
        String ruta = cadena.replace("\"", "");
        File archivo = new File(ruta);
        FileReader lectorArchivo;
        File f = new File(ruta);
        String contenido="";
        try{
            lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);
            
            String aux="";
            while (true) {
                    aux=br.readLine();
                    if(aux!=null)
                        contenido=contenido+aux+"\n";
                    else 
                        break;
                    
            }
            br.close();
            lectorArchivo.close();
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(Puente.class.getName()).log(Level.SEVERE, null, ex);
            }
//        FileInputStream entrada;
//        JOptionPane.showMessageDialog(null, "Creara: " + identificador + " con cadena:" + cadena);
//        
//        String contenido = "";
//        try{
//            entrada=new FileInputStream(archivo);
//            int ascii;
//            while ((ascii=entrada.read())!=-1) {
//                char caracter=(char)ascii;
//                contenido+=caracter;
//            }
//        }catch(Exception e){
//        
//        }
//        
//        
//        System.err.println("AARCHIVO DE ENTRADA:"+contenido);
//        
        System.err.println("AARCHIVO DE ENTRADA:"+contenido);
        try{
            Sintactico sin = new Sintactico(
                new Lexico(new BufferedReader (new StringReader(contenido))));
            sin.parse();
        }catch(Exception e){
            e.printStackTrace();
        }
        //mostrarDatos();
        
    }
    
    
    public static String sumar(String identificador, String cadena){
        
        double sumaTotal = 0.0;
        String resultado= "";
        double edadInt = 0.0;
        String clave = cadena.replace("\"", "");
        //JOptionPane.showMessageDialog(null, "Se sumaran: " + clave + " en: " + identificador);
        for (int i = 0; i < arrClaves.size(); i++) {
            //JOptionPane.showMessageDialog(null, "entro a for");
            Claves c = (Claves) arrClaves.get(i);
            //JOptionPane.showMessageDialog(null, "ahorita: " + c.getClave() +" ID: " +  c.getId());
            if (c.getClave().equals(clave) && c.getId().equals(identificador)) {
                
                ArrayList listaC = c.getContenido();
                for (int j = 0; j < listaC.size(); j++) {
                    String edadString = (String) listaC.get(j);
                    edadInt = Double.parseDouble(edadString);
                    //JOptionPane.showMessageDialog(null, "Dato a sumar:" +edadInt);
                    sumaTotal += edadInt;
                }
                resultado =String.valueOf(sumaTotal);
                //JOptionPane.showMessageDialog(null, "Suma total: " + resultado);
                //JOptionPane.showMessageDialog(null, "Se encontraron: " + listaC.size() + " en: " + clave);
                //String contenidoString = (String) listaC.get(i);
                //JOptionPane.showMessageDialog(null, "Dato a sumar:" +contenidoString);
            }
            
        }
        
        return resultado;
    }
    public static String contar(String identificador){
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < arrClaves.size(); i++) {
            Claves c = (Claves) arrClaves.get(i);
            if (c.getId().equals(identificador)) {
                ArrayList listaC = c.getContenido();
                contador = listaC.size();
            }
        }
        ///JOptionPane.showMessageDialog(null, "REGISTROS en:" + identificador +" son:" + contador);
        resultado = Integer.toString(contador);
        return resultado;
    }
    
    public static String promedio(String identificador, String cadena){
        ArrayList prom = new ArrayList();
        String resultado33= "";
        double promedioTotal = 0.0;
        int contadorArr =0;
        String clave = cadena.replace("\"", "");
        for (int i = 0; i <arrClaves.size(); i++) {
            Claves c = (Claves) arrClaves.get(i);
            if (c.getClave().equals(clave) && c.getId().equals(identificador)) {
                ArrayList listaC = c.getContenido();
                for (int j = 0; j < listaC.size(); j++) {
                    String datoS = (String) listaC.get(j);
                    int datoint = Integer.parseInt(datoS);
                    prom.add(datoint);
                }
            }
        }
        if(prom.size()>0){
            for (int i = 0; i < prom.size(); i++) {
                contadorArr += (int)prom.get(i);
            }
            promedioTotal = (double)contadorArr/prom.size();
        }
        resultado33 = String.valueOf(promedioTotal);
        //JOptionPane.showMessageDialog(null,"PROMEDIO ENVIADO: " + resultado33 );
        return resultado33;
    }
    
    public static void graficar(String nombre, String titulo, String identificador, String valorX, String valorY)throws IOException{
        //JOptionPane.showMessageDialog(null, "");
        //nombre = nombre.jpg
        //titulo = titulo de la imagen
        //identificador nombre de variable tipo archivo
        //valorx = cadena con el nombre de la clave para x
        //valory = cadena con el nombre de la clave para Y 
        ArrayList valX = new ArrayList();
        ArrayList valY = new ArrayList();
        String valorXX = valorX.replace("\"", "");
        String valorYY = valorY.replace("\"", "");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < arrClaves.size(); i++) {
            Claves c = (Claves) arrClaves.get(i);
            ArrayList listaC = c.getContenido();
            if (c.getClave().equals(valorXX)&& c.getId().equals(identificador)) {
                for (int j = 0; j < listaC.size(); j++) {
                    String datoEjeX = (String) listaC.get(j);
                    valX.add(datoEjeX);
                    //dataset.addValue(j+3, datoEjeX , datoEjeX);
                }
            }
            if (c.getClave().equals(valorYY) && c.getId().equals(identificador)) {
                //JOptionPane.showMessageDialog(null, "GRAFICAAAA"+(String)listaC.get(1));
                for (int j = 0; j < listaC.size(); j++) {
                    String datoEjeY = (String) listaC.get(j);
                    valY.add(datoEjeY);
                }
            }
            //JOptionPane.showMessageDialog(null, "DATOX>> " +valX.size() + " DATOY>>" + valY.size() );
//            for (int j = 0; j < valX.size(); j++) {
//               String valXUso = (String)valX.get(j);
//               String valYUso = (String)valY.get(j);
//               dataset.addValue(Integer.parseInt(valYUso),valXUso,valXUso);
//            }
        }
        for (int i = 0; i <valX.size(); i++) {
            String valXUso = (String)valX.get(i);
            String valYUso = (String)valY.get(i);
            dataset.addValue(Double.parseDouble(valYUso), valXUso,valXUso);
            
        }
        //dataset.addValue(2, "randall", "ramos");
        //dataset.addValue(4, "Sofi", "Cordova");
        //dataset.addValue(6, "Mabel", "Osorio");
        //JFreeChart barChart = ChartFactory.createBarChart("titulo", "EjeX", "EjeY", dataset, PlotOrientation.VERTICAL, true, true,true);
        
        JFreeChart barChart = ChartFactory.createBarChart(titulo, valorX, valorY, dataset, PlotOrientation.VERTICAL, true, true,true);
        int width = 640;
        int height = 480;
        String tit = nombre.replace("\"", "");
        File XYChart = new File("graficas\\"+ tit + ".jpeg");
        ChartUtilities.saveChartAsJPEG(XYChart, barChart, width,height);
        
        int altura = 0;
        
        
    }
}
