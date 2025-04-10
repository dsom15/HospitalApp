/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author Dsoch
 */
public class EscritorArchivoTextoPlano implements Escritor  {
        /**
         * representa el conjusnto de caracteres 
         */
       private final Charset CHARSET = Charset.forName("UTF-8");
   
   public EscritorArchivoTextoPlano(){
       
       
   }

    @Override
    public void escribir(ArrayList<String> archivo,String ruta ) throws IOException {
       File file = new File(ruta);
       FileWriter  writer = new FileWriter(file);
       PrintWriter pw = new PrintWriter (writer);
       
       for (String line: archivo){
           pw.println (line);
       }
       writer.close();
       
               
    }
}
