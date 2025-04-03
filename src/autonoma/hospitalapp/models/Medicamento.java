/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Módulo de Farmacia
 * 
 * En este módulo se gestionan los medicamentos del hospital a través de
 *  un inventario, se tiene un registro, venta y control de los medicamentos,
 * de los  2 existentes genericos y de marca, el presupuesto del hospital cambia
 * segun las compras y ventas que se hagan.
 * 
 * @author Juan Esteban Vera Velez
 * @versión 1.0
 * @since 2025-04-02
 */

/**
 * Clase que representa un medicamento en la farmacia del hospital
 */
 abstract class Medicamento {
    /**
     * Nombre del medicamento
     */
       private String nombre;
    
    /**
     * Descripción del Medicamento
     */
       private String descripcion;
    
    /**
     * Costo del medicamento
     */
       private  double costo;
    
    /**
     * Precio de venta de los medicamentos
     */
       protected double precioVenta;
    
    /**
     * Constructor de la clase Medicamento.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo Costo del medicamento.
     */
    public Medicamento(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        calcularPrecioVenta();
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return Nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return Descripción del medicamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el costo del medicamento.
     * 
     * @return Costo del medicamento.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Obtiene el precio de venta del medicamento.
     * 
     * @return Precio de venta.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }
    
    /**
     * Método abstracto para calcular el precio de venta del medicamento.
     */
    protected abstract void calcularPrecioVenta();

}

 