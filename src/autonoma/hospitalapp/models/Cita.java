/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.Date;

/**
 * Clase que representa una cita médica en el sistema del hospital.
 *
 * @version 1.0
 * @since 08/04/2025
 * @author Rafael
 */
public class Cita {

    private Paciente paciente;
    private EmpleadoSalud medico;
    private Date fecha;
    private double valorCita;
    private boolean completada;

    /**
     * Constructor para crear una nueva cita médica.
     *
     * @param paciente El paciente que asistirá a la cita
     * @param medico El médico que atenderá la cita
     * @param fecha Fecha y hora programada para la cita
     * @param valorCita Costo de la consulta médica
     */
    public Cita(Paciente paciente, EmpleadoSalud medico, Date fecha, double valorCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valorCita = valorCita;
        this.completada = false;
    }

    /**
     * Registra la cita como completada en el sistema.
     *
     */
    public void registrarCita() {
        this.completada = true;
    }

    ///// Métodos de acceso (getters y setters) /////
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EmpleadoSalud getMedico() {
        return medico;
    }

    public void setMedico(EmpleadoSalud medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorCita() {
        return valorCita;
    }

    public void setValorCita(double valorCita) {
        this.valorCita = valorCita;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    /**
     * Representación textual de la cita médica.
     */
    @Override
    public String toString() {
        return "Cita{"
                + "paciente=" + paciente.getNombre()
                + ", medico=" + medico.getNombre()
                + ", fecha=" + fecha
                + ", valorCita=" + valorCita
                + ", completada=" + completada
                + '}';
    }
}
