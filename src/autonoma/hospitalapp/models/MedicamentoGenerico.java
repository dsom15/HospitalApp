/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/** Clase que representa un Medicamento Generico
 * Contiene los medicamentos Genericos, 
 * Del Módulo de Farmarcia
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * @since 2025-04-03
 */
  public class MedicamentoGenerico extends Medicamento {
    /**
     * Constructor de la clase MedicamentoGenerico.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo Costo del medicamento.
     */
    public MedicamentoGenerico(String nombre, String descripcion, double costo) {
        super(nombre, descripcion, costo);
    }

    /**
     * Calcula el precio de venta sumando un 10% al costo.
     */
    @Override
    protected void calcularPrecioVenta() {
        super.precioVenta = super.getCosto() * 1.10;
    }
}