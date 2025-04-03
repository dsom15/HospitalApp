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
}
