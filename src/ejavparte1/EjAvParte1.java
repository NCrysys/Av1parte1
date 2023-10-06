/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejavparte1;

import java.util.Scanner;

/**
 *
 * @author a22noellr
 */
public class EjAvParte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
        //ejercicio5();
    }
    
    private static void ejercicio1(){
       try {
           Trabajador trabajador = new Trabajador("Pepe", 20, 2, 2);
           trabajador.setCategoria(0);
           trabajador.setAntiguedad(2);
           System.out.println(trabajador.calcularSueldo());
       }catch (IllegalArgumentException e){
           System.out.println("Categoria ou antiguedad non valida, ingrese numero entre 0 e 2");
       }
    }
    
    private static void ejercicio2(){
       Ejercicio2 ej2 = new Ejercicio2();
    }
    
    private static void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número decimal(1,23).");
        double numero = entrada.nextDouble();
        Ejercicio3 ej3 = new Ejercicio3();
        System.out.println("Desea obtener a parte entera ou a decimal do numero.");
        System.out.println("Parte entera-->1, Parte decimal-->2, Sair-->outro");
        Scanner entrada2 = new Scanner(System.in);
        int parte = entrada2.nextInt();
        if (parte==1){
            System.out.println("Parte entera: "+ej3.getParteEntera(numero));
        }
        else if (parte==2){
            System.out.println("Parte decimal: "+ej3.getParteDecimal(numero));
        }
        else System.out.println("Saindo");
    }
    
    private static void ejercicio4(){
        Ejercicio4 ej4 = new Ejercicio4();
    }
    
    private static void ejercicio5(){
        try{
            Hora hora = new Hora(12,30);
            hora.inc();
            hora.setHora(-1);
            hora.setMinutos(45);
            System.out.println(hora.toString());
        }catch (IllegalArgumentException e){
            System.out.println("Hora ou minuto non validos.");
        }
    }
    
}
