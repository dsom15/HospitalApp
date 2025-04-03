/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/** Clase que representa un medicamento de Marca
 * Contiene los medicamentos Genericos,
 * del Módulo de Farmarcia
 * @author Juan Esteban Vera Velez
 * versión 1.0
 * @since 2025-04-03
 */
    public class MedicamentoMarca extends Medicamento {
    
    /**
     * Fabricante del Medicamento
     */
    private String fabricante;

    /**
     * Constructor de la clase MedicamentoMarca.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo Costo del medicamento.
     * @param fabricante Nombre del fabricante.
     */
    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }   
     
    /**
     * Obtiene el fabricante del medicamento.
     * 
     * @return Nombre del fabricante.
     */
    public String getFabricante() {
        return fabricante;
    }
    /**
     * Calcula el precio de venta sumando un 25% al costo.
     */
    @Override
    protected void calcularPrecioVenta() {
        this.precioVenta = super.getCosto() * 1.25;
    }

}
