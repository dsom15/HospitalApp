/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.MalaFormulacionException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un paciente en el sistema hospitalario.
 * Esta clase almacena la información personal del paciente, su estado de salud,
 * y las listas de enfermedades que tiene y las medicinas que ha recibido.
 * @author Rafael
 * @version 1.1
 * @since 02/04/2025
 */
public class Paciente {

    private String nombre;
    private int numeroDeDocumento;
    private int edad;
    private String correo;
    private String telefono;
    private boolean estado;
    private List<Enfermedad> enfermedades = new ArrayList<>();
    private List<Medicina> medicinas = new ArrayList<>();

    /**
     * Constructor para crear un nuevo paciente.
     * 
     * @param nombre Nombre completo del paciente
     * @param numeroDeDocumento Número de identificación del paciente
     * @param edad Edad del paciente en años
     * @param correo Correo electrónico del paciente
     * @param telefono Número de teléfono del paciente
     */
    public Paciente(String nombre, int numeroDeDocumento, int edad,
            String correo, String telefono) {
        this.nombre = nombre;
        this.numeroDeDocumento = numeroDeDocumento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = true;
    }

    /**
     * Obtiene el nombre del paciente.
     * 
     * @return Nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del paciente
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de documento del paciente.
     * 
     * @return Número de documento de identificación
     */
    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    /**
     * Actualiza el número de documento del paciente.
     * 
     */
    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    /**
     * Obtiene la edad del paciente.
     * 
     * @return Edad del paciente en años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve la edad del paciente.
     * 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el correo electrónico del paciente.
     * 
     * @return Dirección de correo electrónico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Actualiza el correo electrónico del paciente.
     * 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el número de teléfono del paciente.
     * 
     * @return Número de teléfono del paciente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Cambia el número de teléfono del paciente.
     * 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Verifica si el paciente está saludable.
     * 
     * @return true si el paciente no tiene enfermedades registradas, false en caso contrario
     */
    public boolean isSaludable() {
        return estado;
    }

    /**
     * Obtiene la lista de enfermedades del paciente.
     * 
     * @return Lista inmodificable de enfermedades
     */
    public List<Enfermedad> getEnfermedades() {
        return new ArrayList<>(enfermedades);
    }

    /**
     * Obtiene la lista de medicinas recetadas al paciente.
     * 
     * @return Lista inmodificable de medicinas
     */
    public List<Medicina> getMedicinas() {
        return new ArrayList<>(medicinas);
    }

    /**
     * Registra una nueva enfermedad al paciente y actualiza su estado de salud.
     * 
     */
    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
        actualizarEstado();
    }

    /**
     * Trata una enfermedad específica con una medicina.
     * 
     * @param medicina Medicina a administrar
     * @param nombreEnfermedad Nombre de la enfermedad a tratar
     * @throws MalaFormulacionException Si la enfermedad no existe o la medicina ya fue recetada
     */
    public void curarEnfermedad(Medicina medicina, String nombreEnfermedad)
            throws MalaFormulacionException {
        Enfermedad enfermedad = buscarEnfermedad(nombreEnfermedad);
        if (enfermedad == null) {
            throw new MalaFormulacionException("El paciente no tiene la enfermedad: " + nombreEnfermedad);
        }


        if (medicinaYaRecetada(medicina.getNombre())) {
            throw new MalaFormulacionException("La medicina ya fue recetada: " + medicina.getNombre());
        }

        enfermedades.remove(enfermedad);
        medicinas.add(medicina);
        actualizarEstado();
    }

    /**
     * Busca una enfermedad por su nombre.
     * 
     * @param nombre Nombre de la enfermedad a buscar
     * @return La enfermedad encontrada o null si no existe
     */
    private Enfermedad buscarEnfermedad(String nombre) {
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Verifica si una medicina ya fue recetada al paciente.
     * 
     * @param nombreMedicina Nombre de la medicina a verificar
     * @return true si la medicina ya fue recetada, false en caso contrario
     */
    private boolean medicinaYaRecetada(String nombreMedicina) {
        for (Medicina m : medicinas) {
            if (m.getNombre().equalsIgnoreCase(nombreMedicina)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Actualiza el estado de salud del paciente basado en sus enfermedades.
     */
    private void actualizarEstado() {
        this.estado = enfermedades.isEmpty();
    }
}