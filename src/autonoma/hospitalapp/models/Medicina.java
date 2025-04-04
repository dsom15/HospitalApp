/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * @since 02/04/2025 
 * versión 1.0
 * @author Rafael
 */
public class Medicina {
    private String nombre;
    private String descripcion;
    private String enfermedadAliviada;

    public Medicina(String nombre, String descripcion, String enfermedadAliviada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAliviada = enfermedadAliviada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnfermedadAliviada() {
        return enfermedadAliviada;
    }

    public void setEnfermedadAliviada(String enfermedadAliviada) {
        this.enfermedadAliviada = enfermedadAliviada;
    }

    public void asociarEnfermedad(Enfermedad enfermedad) {
        this.enfermedadAliviada = enfermedad.getNombre();
    }
}