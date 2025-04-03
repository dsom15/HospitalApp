/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.Date;

/**
 * Se crea la clase Hospital
 * @author Dsoch
 */
public class Hospital {
    //atributos 
    /**
     * Nombre del Hospital
     */
    private String  nombre;
    /**
     * Direccion del Hospital 
     */
    private String direccion; 
    /**
     * Telefono de contacto del Hospital
     */
    private String telefono;
    /**
     * Presupuesto del Hospital 
     */
    private  double presupuesto;
    /**
     * Meta de la ventas del Hospital 
     */
    private double metaDeventasAnual;
    /**
     * Fecha de la creacion de la fundacion
     */
    private String  fechaFundacion;
    /**
     * Estado si es en quiebra o no del Hospital
     */
    private boolean estado;
    /**
     * 
     */
    private Gerente gerente;
    
    //Constructor
    public Hospital(double metaDeventasAnual, boolean estado,Gerente gerente) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
    }

    public Hospital() {
    }
    
    //Metodos de acceso 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMetaDeventasAnual() {
        return metaDeventasAnual;
    }

    public void setMetaDeventasAnual(double metaDeventasAnual) {
        this.metaDeventasAnual = metaDeventasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    
   
  
    
    
}
