/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;
import java.util.List;

/** Clase que gestiona el inventario de la farmarcia del Hospital
 * Contiene los medicamentos manejados por el Hospital
 * @author Juan Esteban Vera Velez
 * Versión 1.0
 * @since 2025-04-03
 */

class InventarioFarmacia {
    
    /** Lista de medicamentos en el inventario */
    private List<Medicamento> medicamentos;
    
    /** Año de actualización del inventario */
    private int añoActualizacion;

    /**
     * Constructor de la clase InventarioFarmacia.
     */
    public InventarioFarmacia() {
        this.medicamentos = new ArrayList<>();
        this.añoActualizacion = 2025;
    }
    
    /**
     *  Método que Agrega un medicamento al inventario 
     *  y descuenta su costo del presupuesto del hospital.
     * 
     * @param medicamento Medicamento a agregar.
     * @param hospital Hospital al que se le descuenta el costo.
     */
    public void agregarMedicamento(Medicamento medicamento, Hospital hospital) {
        medicamentos.add(medicamento);
        hospital.descontarPresupuesto(medicamento.getCosto());
    }

     /**
     * Vende un medicamento, aumentando el presupuesto del hospital.
     * 
     * @param nombre Nombre del medicamento a vender.
     * @param hospital Hospital al que se le suma la venta.
     */
    public void venderMedicamento(String nombre, Hospital hospital) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                hospital.aumentarPresupuesto(medicamento.getPrecioVenta());
                medicamentos.remove(medicamento);
                break;
            }
        }
    }
}


