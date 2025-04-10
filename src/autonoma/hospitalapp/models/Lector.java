/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Lee un archivo 
 * @author Dsoch
 * @version 1.0.0
 * @since 20250410
 */
public  interface  Lector {
    /**
     * Lee un archivo 
     * @param ruta localizacion del archivo 
     * @return 
     */
    public abstract ArrayList<String>leer(String ruta) throws IOException;
    
    
}
