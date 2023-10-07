/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejavparte1;

/**
 *
 * @author a22noellr
 */
public class Trabajador {
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;
    private double sueldoBase = 607;
    public final static int CAT_EMPLEADO = 0;
    public final static int CAT_ENCARGADO = 1;
    public final static int CAT_DIRECTIVO = 2;
    public final static int ANT_NOVATO = 0;
    public final static int ANT_MADURO = 1;
    public final static int ANT_EXPERTO = 2;

    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
        if (validezCategoria(categoria) && validezAntiguedad(antiguedad)){
            this.nombre = nombre;
            this.edad = edad;
            this.categoria = categoria;
            this.antiguedad = antiguedad;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        if (validezCategoria(categoria)){
            this.categoria = categoria;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        if (validezAntiguedad(antiguedad)){
            this.antiguedad = antiguedad;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    
    private boolean validezCategoria(int categoria){
        if (categoria<0 || categoria>2){
            return false;
        }
        else return true;
    }
    
    private boolean validezAntiguedad(int antiguedad){
        if (antiguedad<0 || antiguedad>2){
            return false;
        }
        else return true;
    }
    
    
    public double calcularSueldo(){
        double sueldo=sueldoBase;
        
        if (categoria==CAT_EMPLEADO){
            sueldo+=sueldoBase*0.15;
        }
        else if(categoria==CAT_ENCARGADO){
            sueldo+=sueldoBase*0.35;
        }
        else if(categoria==CAT_DIRECTIVO){
            sueldo+=sueldoBase*0.6;
        }
        
        if (antiguedad==ANT_NOVATO){
            sueldo+=150;
        }
        else if(antiguedad==ANT_MADURO){
            sueldo+=300;
        }
        else if(antiguedad==ANT_EXPERTO){
            sueldo+=600;
        }
        return sueldo;
    }
}
