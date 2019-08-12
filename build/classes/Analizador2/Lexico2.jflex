/*----------------------------------------------------------------------------
--------------------- 1ra. Area: Codigo de Usuario
----------------------------------------------------------------------------*/

//-------> Paquete, importaciones

package Analizador2;

import java_cup.runtime.*;
import java.util.ArrayList;


%%
/*----------------------------------------------------------------------------
--------------------- 2da. Area: Opciones y Declaraciones
----------------------------------------------------------------------------*/

%{
    String cadena="";
    String Texto="";
    public static ArrayList errorLex=new ArrayList();
	 
	 public void consola(String s){
	 
        System.out.println(s);
    }    

%}

//-------> Directivas
%public
%class Lexico2
%cupsym sym
%cup
%char
%line
%column
%full
%unicode
%ignorecase


//-------> Expresiones Regulares
Terminacion_Linea = [\r|\n|\r\n]
WhiteSpace= [\ \r\t\f\t]


digito = [0-9]+
decimal = [0-9]+"."[0-9]+
letra = [a-zA-ZñÑ]
identificador = {letra}+({letra}|{digito}|"_")*   
cadena = "\""[^\"]*"\""
Espacio = \t|\f|" "|\r|\n
ComentarioSimple=[/][/](([^\n]+)?)
ComentarioMultiple=([\/][\*])(([\s]|[^\n]?)*)([\*][\/])

//-------> Estados    EN ORDEN


%%
/*-------------------------------------------------------------------
--------------------- 3ra. y ultima area: Reglas Lexicas
-------------------------------------------------------------------*/

//-------> Comentarios




//-------> Palabras Reservas

<YYINITIAL>"archivo" { System.out.println("archivo"); return new Symbol(sym.archivo, yycolumn, yyline, yytext());}
<YYINITIAL>"leerArchivo" { System.out.println("leerArchivo"); return new Symbol(sym.leerArchivo, yycolumn, yyline, yytext());}
<YYINITIAL>"Numerico" { System.out.println("Numerico"); return new Symbol(sym.numerico, yycolumn, yyline, yytext());}
<YYINITIAL>"sumar" { System.out.println("sumar"); return new Symbol(sym.sumar, yycolumn, yyline, yytext());}
<YYINITIAL>"Contar" { System.out.println("Contar"); return new Symbol(sym.contar, yycolumn, yyline, yytext());}
<YYINITIAL>"Promedio" { System.out.println("Promedio"); return new Symbol(sym.promedio, yycolumn, yyline, yytext());}
<YYINITIAL>"ContarSi" { System.out.println("ContarSi"); return new Symbol(sym.contarSi, yycolumn, yyline, yytext());}
<YYINITIAL>"ObtenerSi" { System.out.println("ObtenerSi"); return new Symbol(sym.obtenerSi, yycolumn, yyline, yytext());}
<YYINITIAL>"Imprimir" { System.out.println("Imprimir"); return new Symbol(sym.imprimir, yycolumn, yyline, yytext());}
<YYINITIAL>"Graficar" { System.out.println("graficar"); return new Symbol(sym.graficar, yycolumn, yyline, yytext());}
<YYINITIAL>"Cadena" { System.out.println("varcadena"); return new Symbol(sym.tcadena, yycolumn, yyline, yytext());}




// simbolos 
<YYINITIAL> "="     { System.out.println("igual"); return new Symbol(sym.igual, yyline, yycolumn,yytext());}
<YYINITIAL> "["     { System.out.println("corA"); return new Symbol(sym.corA, yyline, yycolumn,yytext());}
<YYINITIAL> "]"     { System.out.println("corC"); return new Symbol(sym.corC, yyline, yycolumn,yytext());}
<YYINITIAL> ","     { System.out.println("coma"); return new Symbol(sym.coma, yyline, yycolumn,yytext());} 
<YYINITIAL> "{"    { System.out.println("llaveA"); return new Symbol(sym.llaveA, yyline, yycolumn,yytext());} 
<YYINITIAL> "}"     { System.out.println("llaveC"); return new Symbol(sym.llaveC, yyline, yycolumn,yytext());}
<YYINITIAL> ";"     { System.out.println("puntocoma"); return new Symbol(sym.puntocoma, yyline, yycolumn,yytext());}
<YYINITIAL> "("     { System.out.println("parA"); return new Symbol(sym.parA, yyline, yycolumn,yytext());}
<YYINITIAL> ")"     { System.out.println("parentesisC"); return new Symbol(sym.parC, yyline, yycolumn,yytext());}
<YYINITIAL> "<"     { System.out.println("menorque"); return new Symbol(sym.menorque, yyline, yycolumn,yytext());}
<YYINITIAL> ">"     { System.out.println("mayorque"); return new Symbol(sym.mayorque, yyline, yycolumn,yytext());}
<YYINITIAL> "!"     { System.out.println("desigual"); return new Symbol(sym.desigual, yyline, yycolumn,yytext());}
<YYINITIAL> ":"     { System.out.println("dospuntos"); return new Symbol(sym.dospuntos, yyline, yycolumn,yytext());}




<YYINITIAL> {identificador}     { System.out.println("identificador "); return new Symbol(sym.identificador, yyline, yycolumn,yytext());} 
<YYINITIAL> {digito}     {  return new Symbol(sym.digito, yyline, yycolumn,yytext());}
<YYINITIAL> {decimal}     {return new Symbol(sym.decimal, yyline, yycolumn,yytext());} 
<YYINITIAL> {cadena}     {System.out.println("cadena "); return new Symbol(sym.cadena, yyline, yycolumn,yytext());}
 


<YYINITIAL> {WhiteSpace} {}
<YYINITIAL> {Espacio} {}
<YYINITIAL> {Terminacion_Linea} {}
<YYINITIAL> {ComentarioSimple} {}
<YYINITIAL> {ComentarioMultiple} {}


[ \t\r\n\f]+                 {/* ignore white space. */ }
 
.                           {   System.out.println("Error Lexico: <<"+yytext()+">> ["+yyline+" , "+yycolumn+"]");
                                /*AcepErr datos =new AcepErr(yytext(),"ERROR LEXICO",(yyline+1),(yycolumn+1), "Simbolo no existe en el lenguaje");
                                    TablaErr.add(datos);*/
                                    //ErrorLS er = new ErrorLS("Lexico",yytext(),"",yyline,yycolumn);
                                    //HtmlClase.arrError.add(er);
                             
                                System.out.println("Error Lexico: <<"+yytext()+">> ["+yyline+" , "+yycolumn+"]");
                             

                            }





