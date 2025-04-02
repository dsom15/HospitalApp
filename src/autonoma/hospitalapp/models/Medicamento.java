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
    protected String nombre;
    
    /**
     * Descripción del Medicamento
     */
    protected String descripcion;
    
    /**
     * Costo del medicamento
     */
    protected double costo;
    
    /**
     * Precio de venta de los medicamentos
     */
    protected double precioVenta;
 }