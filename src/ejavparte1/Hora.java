/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejavparte1;

/**
 *
 * @author a22noellr
 */
class Hora {
    private int hora;
    private int minuto;
    
    public Hora(int hora, int minuto) {
        if (hora<0 || hora>23 || minuto<0 || minuto>59){
            throw new IllegalArgumentException();
        }
        else{
            this.hora=hora;
            this.minuto=minuto;
        }
    }
    
    public void inc(){
        if (minuto==59){
            minuto=0;
            if (hora==23){
                hora=0;
            }
            else hora++;
        }
        else minuto++;
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    public boolean setMinutos (int valor){
        if (valor<0 || valor>59){
            return false;
        }
        else{
            minuto=valor;
            return true;
        }
    }
    
    public boolean setHora (int valor){
        if (valor<0 || valor>23){
            return false;
        }
        else{
            hora=valor;
            return true;
        }
    }
    
    public String toString(){
        String horaExacta=hora+":"+minuto;
        return horaExacta;
    }
}
