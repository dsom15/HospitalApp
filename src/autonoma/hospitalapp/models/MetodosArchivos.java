/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;


import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Se crea la clase Metodos Archivos
 * @author Dsoch
 * @since 02042025
 * @version 1.0.0
 */
public class MetodosArchivos {
    /**
     * Metodo para crear un archivo txt 
     * @param archivo 
     */
    public void crearArchivo (String archivo){
            File f1 = new File (archivo);
            PrintWriter pw;
            
            try {
                pw = new PrintWriter(f1);
                pw.close();
            }catch (FileNotFoundException ex){
                ex.printStackTrace();
            }

    }
    
}
