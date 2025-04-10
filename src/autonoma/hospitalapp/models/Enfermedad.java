/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa una enfermedad dentro del sistema hospitalario
 * Se tiene el nombre de la enfermedad y una descripción sobre aquella
 * @author Rafael
 * versión 1.0
 * @since 03/04/2025
 * 
 */
public class Enfermedad {
   /**
     * Nombre de la enfermedad.
     */
    private String nombre;

    /**
     * Descripción general de la enfermedad.
     */
    private String descripcion;

    /**
     * Constructor que permite crear una enfermedad con su nombre y descripción.
     *
     * @param nombre Nombre de la enfermedad.
     * @param descripcion Descripción de la enfermedad.
     */
    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la enfermedad.
     *
     * @return Nombre de la enfermedad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la enfermedad.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la enfermedad.
     *
     * @return Descripción de la enfermedad.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una nueva descripción para la enfermedad.
     *
     * @param descripcion Nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve únicamente la descripción de la enfermedad.
     *
     * @return Descripción.
     */
    public String obtenerDescripcion() {
        return this.descripcion;
    }
}