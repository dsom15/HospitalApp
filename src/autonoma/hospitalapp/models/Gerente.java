/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * @since 31/03/2025
 * versión 1.0
 * @author Rafael 
 */
public class Gerente {

    private String nombre;
    private String documentoIdentidad;
    private int edad;
    private String carrera;

    public Gerente(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void actualizarDatos(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre
                + "\nDocumento: " + documentoIdentidad
                + "\nEdad: " + edad
                + "\nCarrera: " + carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
