/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * lee un archivo de texto plano
 *
 * @author Dsoch
 * @version 1.0.0
 * @since 20250410
 *
 */
public class LectorArchivoTextoPlano implements Lector {

    /**
     * archivo guardado por lineas
     */
    private ArrayList<String> archivo;
    /**
     * Formato de texto del archivo
     */
    private final Charset CHARSET = Charset.forName("UTF-8");

    ///////////////////constructor
    public LectorArchivoTextoPlano() {

        this.archivo = new ArrayList<>();
    }

    //////////////////////////MEtodos
    /**
     * Lee un archivo
     *
     * @param ruta localizacion del archivo
     * @return
     */
    @Override
    public ArrayList<String> leer(String ruta) throws IOException {
        this.archivo.clear();
        File file = new File(ruta);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String linea;
        while ((linea = buffer.readLine()) != null) {
            this.archivo.add(linea);

        }
        reader.close();
        return this.archivo;
    }
}