package claseFile;

import java.io.File;

public class ClaseFile {

    public static void main(String[] args) {
        
        File archivo = new File("prueba.txt");

        if (archivo.exists()) {
            System.out.println("EL archivo existe");
            System.out.println("Ruta Absoluta: " + archivo.getAbsolutePath());
            System.out.println("¿Es un archivo? " + archivo.isFile());
            System.out.println("¿Se puede leer ? " + archivo.canRead());
        } else {
            System.out.println("El archivo no existe");
        }
        
        System.out.println("");

        File directorio = new File("carpetaPrueba");

        if (directorio.exists()) {

            System.out.println("EL archivo existe");
            System.out.println("Ruta Absoluta: " + directorio.getAbsolutePath());
            System.out.println("¿Es un archivo? " + directorio.isDirectory());
            System.out.println("¿Se puede leer ? " + directorio.canRead());
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
