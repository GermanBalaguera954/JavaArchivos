package archviodetexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoDeTexto {

    File archivo;

    private void crearArchivo() {
        archivo = new File("prueba.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo");
        }
    }

    private void crearDirectorio() {
        archivo = new File("carpetaPrueba");

        if (archivo.mkdir()) {
            System.out.println("Se ha creado el directorio correctamente");
        } else {
            System.out.println("Error no se ha podido crear el directorio");
        }
    }

    private void escribirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Hola que tal?");
            escribir.write("\r\nMas texto");
            escribir.close();

        } catch (IOException ex) {
            System.err.println("No se pudo escribir sobre el archivo");
        }
    }

    private void añadirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\r\nMucho mas texto");
            escribir.write("\r\nAhora mas");
            escribir.close();

        } catch (IOException ex) {
            System.err.println("No se pudo escribir sobre el archivo");
        }
    }

    private void leerTexto() {
        String cadena;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = lectura.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Error, " + ex);
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
    }

    public static void main(String[] args) {

        ArchivoDeTexto archivos = new ArchivoDeTexto();
        archivos.crearArchivo();
        archivos.escribirTexto();
        archivos.añadirTexto();
        archivos.leerTexto();
        //archivos.crearDirectorio();
    }
}
