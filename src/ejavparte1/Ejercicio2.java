/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejavparte1;

/**
 *
 * @author a22noellr
 */
public class Ejercicio2 {
    String cadena;
    
    public Ejercicio2() {
        cadena="apacolegustaelchocolatewxyz";
        System.out.println(cifradoCesar(cadena.toUpperCase()));
    }
    
    public String cifradoCesar (String cadenaACifrar){
        String cadenaCifrada="";
        for (int i=0; i<cadenaACifrar.length(); i++){
            char caracterI = cadenaACifrar.charAt(i);
            if (caracterI=='X'){
                cadenaCifrada+='A';
            }
            else if (caracterI=='Y'){
                cadenaCifrada+='B';
            }
            else if (caracterI=='Z'){
                cadenaCifrada+='C';
            }
            else cadenaCifrada+=(char) (caracterI+3);
        }
        return cadenaCifrada;
    }
}
