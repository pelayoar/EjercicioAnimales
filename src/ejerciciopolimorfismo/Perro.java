/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimorfismo;

/**
 *
 * @author a20pelayoar
 */
public class Perro extends OperacionesAnimales{
    
    
    private String nombre;
    private int edad;
    private boolean raboLargo;
    private final String expresion;
    private final String tipo;
    
    public Perro(String nombre, int edad, boolean raboLargo){
        this.nombre = nombre;
        this.edad = edad;
        this.raboLargo = raboLargo;
        expresion = "GUAU";
        tipo = "PERRO";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getRaboLargo() {
        return raboLargo;
    }

    public String getExpresion() {
        return expresion;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
