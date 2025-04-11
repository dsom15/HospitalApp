/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * se crea la clase empleado de salud
 *
 * @author Dsoch
 * @since 03042025
 * @version 1.0.0
 */
public class EmpleadoSalud extends Empleado {

    /**
     * especialidad el empleado
     */
    private String especialidad;
    /**
     * horas que trabajo el empleado
     */
    private double horasTrabajadas;

    // Constructor
    public EmpleadoSalud(String especialidad, double horasTrabajadas, String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    //Metodos de acceso
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * metodo para calcular el salario
     *
     * @return el salario a pagar del empleado
     */
    @Override
    public double calcularSalario() {
        double salud = 0.012;
        double salario = (getSalarioBase() * salud * horasTrabajadas) + getSalarioBase();
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado Salud - Nombre: " + this.getNombre()
                + ", Documento: " + this.getNumeroDocumento()
                + ", Edad: " + this.getEdad()
                + ", Salario Base: " + this.getSalarioBase()
                + ", Especialidad: " + this.getEspecialidad()
                + ", Horas Trabajadas: " + this.getHorasTrabajadas();
    }
}
