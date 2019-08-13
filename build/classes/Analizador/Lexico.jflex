/*----------------------------------------------------------------------------
--------------------- 1ra. Area: Codigo de Usuario
----------------------------------------------------------------------------*/

//-------> Paquete, importaciones

package Analizador;

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
%class Lexico
%cupsym sym
%cup
%char
%line
%column
%full
%unicode
%ignorecase
%8bit

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

<YYINITIAL>"claves" { System.out.println("Claves"); return new Symbol(sym.claves, yycolumn, yyline, yytext());}
<YYINITIAL>"registros" { System.out.println("Registros"); return new Symbol(sym.registros, yycolumn, yyline, yytext());}



// simbolos 
<YYINITIAL> "="     { System.out.println("igual"); return new Symbol(sym.igual, yyline, yycolumn,yytext());}
<YYINITIAL> "["     { System.out.println("corA"); return new Symbol(sym.corA, yyline, yycolumn,yytext());}
<YYINITIAL> "]"     { System.out.println("corC"); return new Symbol(sym.corC, yyline, yycolumn,yytext());}
<YYINITIAL> ","     { System.out.println("coma"); return new Symbol(sym.coma, yyline, yycolumn,yytext());} 
<YYINITIAL> "{"    { System.out.println("llaveA"); return new Symbol(sym.llaveA, yyline, yycolumn,yytext());} 
<YYINITIAL> "}"     { System.out.println("llaveC"); return new Symbol(sym.llaveC, yyline, yycolumn,yytext());}




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




