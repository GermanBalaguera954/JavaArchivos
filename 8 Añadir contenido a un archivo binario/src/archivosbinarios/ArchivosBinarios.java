package archivosbinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivosBinarios {

    private void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            Persona persona1 = new Persona("German", 33);
            Persona persona2 = new Persona("Leidy", 31);
            Persona persona3 = new Persona("Sebastian", 11);

            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);

            escritura.close(); // cerramos el archvio binario

        } catch (FileNotFoundException ex) {
            System.err.println("Error " + ex);
        } catch (IOException ex) {
            System.err.println("Error " + ex);
        }
    }

    private void leerBinarios() {
        Persona objetoPersona;

        try {
            FileInputStream archvivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archvivo);

            while (true) { //Recorremos el archivo binario.
                objetoPersona = (Persona) lectura.readObject();
                objetoPersona.mostrarDatos();
            }
        } catch (EOFException ex) {
            return; //Finalizo de leer todo el archivo binario.
        } catch (FileNotFoundException ex) {
            System.err.println("Error " + ex);
        } catch (IOException ex) {
            System.err.println("Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error " + ex);
        }
    }
    
    private void añadirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            AñadirContenido escritura = new AñadirContenido(archivo);

            Persona persona1 = new Persona("Pedro", 22);
            Persona persona2 = new Persona("Diana", 28);            

            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);            

            escritura.close(); // cerramos el archvio binario

        } catch (FileNotFoundException ex) {
            System.err.println("Error " + ex);
        } catch (IOException ex) {
            System.err.println("Error " + ex);
        }
    }

    public static void main(String[] args) {
        ArchivosBinarios archivos = new ArchivosBinarios();
        
        //archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinarios();
        
    }
}
