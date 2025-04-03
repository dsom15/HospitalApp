/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;


import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    /**
     *  Metodo para escribir el archivo
     * @param archivo
     * @param texto 
     */
    public void escribirArchivo (String archivo,String texto){
        File f1 = new File (archivo);
        try {
            PrintWriter pw= new PrintWriter (new FileWriter(f1,true));
            pw.print(texto);
            pw.close();
            
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
    
    
}
