/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopolimorfismo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a20pelayoar
 */
public class OperacionesAnimales implements Serializable {

    static Perro[] perros = new Perro[5];
    static Gato[] gatos = new Gato[5];

    public static boolean addPerro(Perro perro) {
        boolean success = false;
        int contador = 0;

        for (int i = 0; i < perros.length; i++) {

            if (perros[i] == null & contador == 0) {
                perros[i] = perro;
                contador++;
            }

        }
        if (contador != 0) {
            success = true;
        }

        return success;
    }

    public static boolean addGato(Gato gato) {
        boolean success = false;
        int contador = 0;

        for (int i = 0; i < gatos.length; i++) {

            if (gatos[i] == null & contador == 0) {
                gatos[i] = gato;
                contador++;
            }

        }
        if (contador != 0) {
            success = true;
        }

        return success;
    }

    public static void animalesADisco(String fichero) {

        try {
            FileOutputStream fos = new FileOutputStream(fichero + ".dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Perro perro : perros) {
                oos.writeObject(perro);
            }

            for (Gato gato : gatos) {
                oos.writeObject(gato);
            }
            oos.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static String toString(OperacionesAnimales animal) {
        String result;
        
        if (animal != null) {
            if (animal instanceof Perro) {
                result = "Nombre: " + ((Perro) animal).getNombre() + "; Edad: " + ((Perro) animal).getEdad() + "; Rabo Largo: " + ((Perro) animal).getRaboLargo() + "; Expresion: " + ((Perro) animal).getExpresion();

            } else {
                result = "Nombre: " + ((Gato) animal).getNombre() + "; Edad: " + ((Gato) animal).getEdad() + "; Bigote Largo: " + ((Gato) animal).getBigoteLargo() + "; Expresion: " + ((Gato) animal).getExpresion();
            }
        } else {
            result = "Null Object";
        }
        return result;

    }

    public static OperacionesAnimales[] leerAnimalesDisco(String fichero) {

        OperacionesAnimales[] animales = null;

        try {
            FileInputStream fis = new FileInputStream(fichero + ".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            animales = new OperacionesAnimales[perros.length + gatos.length];

            for (int i = 0; i < animales.length; i++) {
                animales[i] = (OperacionesAnimales) ois.readObject();
            }

            ois.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return animales;

    }

}
