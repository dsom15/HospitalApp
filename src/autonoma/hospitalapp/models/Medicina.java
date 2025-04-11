/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa una medicina en el sistema hospitalario.
 * 
 * @author Rafael
 * @version 1.0
 * @since 02/04/2025
 */
public class Medicina {
    
    /**
     * Nombre comercial o genérico del medicamento.
     */
    private String nombre;
    
    /**
     * Descripción detallada del medicamento (composición, uso, etc.).
     */
    private String descripcion;
    
    /**
     * Nombre de la enfermedad que este medicamento ayuda a tratar.
     */
    private String enfermedadAliviada;

    /**
     * Constructor para crear una nueva instancia de Medicina.
     * 
     * @param nombre Nombre del medicamento (no puede ser nulo o vacío)
     * @param descripcion Descripción del medicamento
     * @param enfermedadAliviada Enfermedad que trata este medicamento
     * @throws IllegalArgumentException Si el nombre es nulo o vacío
     */
    public Medicina(String nombre, String descripcion, String enfermedadAliviada) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del medicamento no puede estar vacío");
        }
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAliviada = enfermedadAliviada;
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return Nombre del medicamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del medicamento.
     * 
     * @param nombre Nuevo nombre del medicamento (no puede ser nulo o vacío)
     * @throws IllegalArgumentException Si el nombre es nulo o vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del medicamento no puede estar vacío");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return Descripción detallada del medicamento
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del medicamento.
     * 
     * @param descripcion Nueva descripción del medicamento
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la enfermedad que alivia este medicamento.
     * 
     * @return Nombre de la enfermedad tratada
     */
    public String getEnfermedadAliviada() {
        return enfermedadAliviada;
    }

    /**
     * Establece la enfermedad que alivia este medicamento.
     * 
     * @param enfermedadAliviada Nombre de la enfermedad tratada
     */
    public void setEnfermedadAliviada(String enfermedadAliviada) {
        this.enfermedadAliviada = enfermedadAliviada;
    }

    /**
     * Asocia este medicamento a una enfermedad específica.
     * 
     * @param enfermedad Objeto Enfermedad a asociar (no puede ser nulo)
     * @throws IllegalArgumentException Si la enfermedad es nula
     */
    public void asociarEnfermedad(Enfermedad enfermedad) {
        if (enfermedad == null) {
            throw new IllegalArgumentException("La enfermedad no puede ser nula");
        }
        this.enfermedadAliviada = enfermedad.getNombre();
    }
}