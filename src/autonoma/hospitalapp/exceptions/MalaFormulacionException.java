/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 *@since 03/04/2025
 * versión 1.0
 * @author Rafael
 */
public class MalaFormulacionException extends Exception {
    
    /**
     * Excepción cuando hay un erro en la formulación meidca
     * @param mensaje 
     */
    public MalaFormulacionException(String mensaje) {
        super("Error en la formulación médica:");
    }
}
