/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Se crea la clase Metodos Archivos
 *
 * @author Dsoch
 * @since 02042025
 * @version 1.0.0
 */
public class MetodosArchivos {

    /**
     * Metodo para crear un archivo txt
     *
     * @param archivo
     */
    public void crearArchivo(String archivo) {
        File f1 = new File(archivo);
        PrintWriter pw;

        try {
            pw = new PrintWriter(f1);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Metodo para escribir el archivo
     *
     * @param archivo
     * @param texto
     */
    public void escribirArchivo(String archivo, String texto) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.print(texto);
            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * se crea el metodo leer archivo se almacena en un array la informacion
     *
     * @param archivo
     */
    public List<String> leerArchivo(String archivo) {
        List<String> lineas = new ArrayList<>();
        File f1 = new File(archivo);

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return lineas;
    }

    /**
     * se crea metodo para mostrar archivos del directorio
     *
     * @param directorio
     */
    public void archivosDirectorio(String directorio) {
        File f1 = new File(directorio);

        String[] archivos = f1.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }

    }

    /**
     * Metodo para guardar la informacion de la nomina en un archivo
     *
     * @param archivo
     * @param nomina
     */
    public void guardarNomina(String archivo, Nomina nomina) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.println("ID Nomina: " + nomina.getId());
            pw.println("Fecha: " + nomina.getFecha());
            pw.println("Empleados:");

            for (Empleado e : nomina.getEmpleados()) {
                pw.println("Nombre: " + e.getNombre() + ", Salario: " + e.calcularSalario());
            }

            pw.println("Total Nomina: " + nomina.getTotalSalarioNomina());
            pw.println("----------------------------------");
            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

  


}
