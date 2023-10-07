/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejavparte1;

/**
 *
 * @author a22noellr
 */
public class Ejercicio3 {
    
    public Ejercicio3() {
    }
    
    public int getParteEntera(double numero){
        Double num = numero;
        String cadenaNum = num.toString();
        String[] cadenaDividida = cadenaNum.split("\\.");
        int parteEntera = Integer.parseInt(cadenaDividida[0]);
        return parteEntera;
    }
    
    public int getParteDecimal(double numero){
        Double num = numero;
        String cadenaNum = num.toString();
        String[] cadenaDividida = cadenaNum.split("\\.");
        int parteDecimal = Integer.parseInt(cadenaDividida[1]);
        return parteDecimal;
    }
}
