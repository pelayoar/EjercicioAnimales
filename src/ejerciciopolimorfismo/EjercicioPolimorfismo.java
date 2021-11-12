/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimorfismo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author a20pelayoar
 */
public class EjercicioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
        Perro perro1 = new Perro("Balto", 4, true);
        Perro perro2 = new Perro("Tobi", 1, false);
        Perro perro3 = new Perro("Koli", 1, false);
        Perro perro4 = new Perro("Rodi", 1, false);
        
        Gato gato1 = new Gato("Michi", 2, true);
        Gato gato2 = new Gato("Mario", 2, true);
        Gato gato3 = new Gato("Jose", 2, true);
        Gato gato4 = new Gato("Lalo", 2, true);
        Gato gato5 = new Gato("Lila", 2, true);
        
        OperacionesAnimales.addPerro(perro1);
        OperacionesAnimales.addPerro(perro2);
        OperacionesAnimales.addPerro(perro3);
        OperacionesAnimales.addPerro(perro4);
        
        OperacionesAnimales.addGato(gato1);
        OperacionesAnimales.addGato(gato2);
        OperacionesAnimales.addGato(gato3);
        OperacionesAnimales.addGato(gato4);
        OperacionesAnimales.addGato(gato5);
        
        
        OperacionesAnimales.animalesADisco("prueba");
        OperacionesAnimales[] animales = OperacionesAnimales.leerAnimalesDisco("prueba");
        
        for(OperacionesAnimales animal : animales){
            System.out.println(OperacionesAnimales.toString(animal));
           
        }
        
        
    }
    
}
