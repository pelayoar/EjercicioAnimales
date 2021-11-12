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
public class Gato extends OperacionesAnimales{
    private final String tipo;
    private String nombre;
    private int edad;
    private boolean bigoteLargo;
    private final String expresion;
    
    public Gato(String nombre, int edad, boolean bigoteLargo){
        this.nombre = nombre;
        this.edad = edad;
        this.bigoteLargo = bigoteLargo;
        expresion = "MIAU";
        tipo = "GATO";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getBigoteLargo() {
        return bigoteLargo;
    }

    public String getExpresion() {
        return expresion;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
