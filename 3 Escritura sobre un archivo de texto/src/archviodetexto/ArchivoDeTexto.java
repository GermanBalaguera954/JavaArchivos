package archviodetexto;

import java.io.File;
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
            escribir.write("\r\n Mucho mas texto");
            escribir.write("\r\n Ahora mas");
            escribir.close();

        } catch (IOException ex) {
            System.err.println("No se pudo escribir sobre el archivo");
        }
    }

    public static void main(String[] args) {

        ArchivoDeTexto archivos = new ArchivoDeTexto();
        archivos.crearArchivo();
        archivos.escribirTexto();
        archivos.añadirTexto();

        //archivos.crearDirectorio();
    }
}
