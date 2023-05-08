package archviodetexto;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoDeTexto {

    File archivo;

    private void crearArchivo() {
        archivo = new File("pruba.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo");
        }
    }
    
    private void crearDirectorio(){
        archivo = new File("carpetaPrueba");
        
        if (archivo.mkdir()) {
            System.out.println("Se ha creado el directorio correctamente");
        }
        else{
            System.out.println("Error no se ha podido crear el directorio");
        }
    }
    public static void main(String[] args) {
        
        ArchivoDeTexto archivos = new ArchivoDeTexto();        
        archivos.crearArchivo();
        archivos.crearDirectorio();
    }
}
