/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Chriss Ramos
 */
public class Variable {
    String identificador = "";
    String valorString = "";
    String tipo = "";
    int valorInt = 0;
    double valorDouble=0.0;
    public Variable() {
    }
    public Variable(String identificador, String tipo, String valorString){
        this.identificador = identificador;
        this.valorString = valorString;
        this.tipo = tipo;
    }

    public Variable(String identificador, String tipo, int valorInt){
        this.identificador = identificador;
        this.valorInt = valorInt;
        this.tipo = tipo;
    }

    public double getValorDouble() {
        return valorDouble;
    }

    public void setValorDouble(double valorDouble) {
        this.valorDouble = valorDouble;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public int getValorInt() {
        return valorInt;
    }

    public void setValorInt(int valorInt) {
        this.valorInt = valorInt;
    }
    
    
}
