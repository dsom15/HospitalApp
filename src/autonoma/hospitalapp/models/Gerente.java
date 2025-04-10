/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa un Gerente dentro del sistema hospitalario.
 * Hay atributos básicos como nombre, documento de identidad, edad y carrera profesional
 * @author Rafael 
 * versión 1.0
 * * @since 31/03/2025
 */
public class Gerente {

  /**
     * Nombre completo del gerente.
     */
    private String nombre;

    /**
     * Documento de identidad del gerente.
     */
    private String documentoIdentidad;

    /**
     * Edad del gerente.
     */
    private int edad;

    /**
     * Carrera profesional del gerente.
     */
    private String carrera;

    /**
     * Constructor que permite crear un gerente con todos sus datos.
     *
     * @param nombre Nombre completo del gerente.
     * @param documentoIdentidad Documento de identidad del gerente.
     * @param edad Edad del gerente.
     * @param carrera Carrera profesional del gerente.
     */
    public Gerente(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Constructor vacío. Inicializa el gerente sin valores definidos.
     */
    public Gerente() {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Actualiza todos los datos del gerente.
     *
     * @param nombre Nuevo nombre.
     * @param documentoIdentidad Nuevo documento de identidad.
     * @param edad Nueva edad.
     * @param carrera Nueva carrera profesional.
     */
    public void actualizarDatos(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Obtiene toda la información del gerente en formato de texto.
     *
     * @return Una cadena con el nombre, documento, edad y carrera.
     */
    public String obtenerDatos() {
        return "Nombre: " + nombre
                + "\nDocumento: " + documentoIdentidad
                + "\nEdad: " + edad
                + "\nCarrera: " + carrera;
    }

    /**
     * Obtiene el nombre del gerente.
     *
     * @return Nombre del gerente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Permite dar un nuevo nombre para el gerente.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identidad del gerente.
     *
     * @return Documento de identidad.
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    /**
     * Para modificar o tener  un nuevo documento de identidad.
     *
     * @param documentoIdentidad Nuevo documento de identidad.
     */
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    /**
     * Obtiene la edad del gerente.
     *
     * @return Edad del gerente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Para modificar una nueva edad para el gerente.
     *
     * @param edad Nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la carrera profesional del gerente.
     *
     * @return Carrera del gerente.
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Para Modificar una nueva carrera profesional para el gerente.
     *
     * @param carrera Nueva carrera.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}