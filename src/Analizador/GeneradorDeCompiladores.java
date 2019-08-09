/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author Chriss Ramos
 */
public class GeneradorDeCompiladores {
    public static void main(String[] arg){
        generarCompilador();
        
    }
    
    public static void generarCompilador(){
        try{
            String ruta = "src/Analizador/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d",ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser","Sintactico", ruta + "Sintactico.cup" };
            java_cup.Main.main(opcCUP);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
