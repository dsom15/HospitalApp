/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Se crea la clase escritor
 * @author Dsoch
 * @version 1.0.0
 * @since 20250410
 */
public interface Escritor {
     public abstract void escribir (ArrayList<String>archivo,String ruta) throws IOException;
     
    
}
