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
    // Constructor
    public MalaFormulacionException(String mensaje) {
        super("Error en la formulación médica:");
    }
}
