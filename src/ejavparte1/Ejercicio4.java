/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejavparte1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author a22noellr
 */
class Ejercicio4 {
        String nome1;
        String nome2;
        String[] data1Dividido;
        String[] data2Dividido;
    
    public Ejercicio4() {
        introduceDatos();
    }

    private void introduceDatos() {
        System.out.println("Introduce o nome e a data de nacemento [DD/MM/YYYY] de dos personas.");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primera persona:");
        System.out.print("Nome: ");
        nome1 = entrada.nextLine();
        int mes1;
        do{
            System.out.print("Data de nacemento: ");
            String data1 = entrada.nextLine();
            data1Dividido = data1.split("\\/");
            mes1 = Integer.parseInt(data1Dividido[1]);
        }while (mes1<1 || mes1>12);
        
        System.out.println("Segunda persona:");
        System.out.print("Nome: ");
        nome2 = entrada.nextLine();
        int mes2;
        do{
            System.out.print("Data de nacemento: ");
            String data2 = entrada.nextLine();
            data2Dividido = data2.split("\\/");
            mes2 = Integer.parseInt(data2Dividido[1]);
        }while (mes2<1 || mes2>12);
        
        calcularMaior();
        System.out.println(nome1 + " ten " + calcularEdad(data1Dividido) + " anos e " + nome2 + " ten " + calcularEdad(data2Dividido) + " anos.");
    }

    private void calcularMaior() {
        int dia1 = Integer.parseInt(data1Dividido[0]);
        int mes1 = Integer.parseInt(data1Dividido[1]);
        int ano1 = Integer.parseInt(data1Dividido[2]);
        int dia2 = Integer.parseInt(data2Dividido[0]);
        int mes2 = Integer.parseInt(data2Dividido[1]);
        int ano2 = Integer.parseInt(data2Dividido[2]);
        
        if (ano1==ano2){
            if (mes1==mes2){
                if (dia1==dia2){
                    System.out.println(nome1 + " e " + nome2 + " naceron o mesmo día.");
                }
                else if (dia1<dia2){
                    System.out.println(nome1 + " é maior.");
                }
                else{
                    System.out.println(nome2 + " é maior.");
                }
            }
            else if (mes1<mes2){
                System.out.println(nome1 + " é maior.");
            }
            else{
                System.out.println(nome2 + " é maior.");
            }
        }
        else if (ano1<ano2) {
            System.out.println(nome1 + " é maior.");
        }
        else {
            System.out.println(nome2 + " é maior.");
        }
    }

    private int calcularEdad(String[] dataDividido) {
        LocalDate hoxe = LocalDate.now();
        String[] dataHoxe = hoxe.toString().split("\\-");
        int diaHoxe = Integer.parseInt(dataHoxe[2]);
        int mesHoxe = Integer.parseInt(dataHoxe[1]);
        int anoHoxe = Integer.parseInt(dataHoxe[0]);
        int diaPersoa = Integer.parseInt(dataDividido[0]);
        int mesPersoa = Integer.parseInt(dataDividido[1]);
        int anoPersoa = Integer.parseInt(dataDividido[2]);
        int idade=anoHoxe-anoPersoa;
        if (mesHoxe==mesPersoa){
            if (diaHoxe<diaPersoa){
                idade--;
            }
        }
        else if (mesHoxe<mesPersoa){
            idade--;
        }
        return idade;
    }
    
}
