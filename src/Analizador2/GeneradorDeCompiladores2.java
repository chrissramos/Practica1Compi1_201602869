/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador2;

/**
 *
 * @author Chriss Ramos
 */
public class GeneradorDeCompiladores2 {
    
    public static void main(String[] arg){
        //generarCompilador();
        generarCompilador2();
    }
    
    public static void generarCompilador2(){
        try{
            String ruta = "src/Analizador2/";
            String opcFlex[] = {ruta + "Lexico2.jflex", "-d",ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser","Sintactico2", ruta + "Sintactico2.cup" };
            java_cup.Main.main(opcCUP);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
