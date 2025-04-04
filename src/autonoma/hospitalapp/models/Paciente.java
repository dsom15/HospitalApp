/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;
import java.util.List;

//import excepciones.MalaFormulacionException;//


/**
 *@since 02/04/2025
 * versión 1.0
 * @author Rafael
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

    public Paciente(String nombre, int numeroDeDocumento, int edad, 
                   String correo, String telefono) {
        this.nombre = nombre;
        this.numeroDeDocumento = numeroDeDocumento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = true; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSaludable() {
        return estado;
    }

    public List<Enfermedad> getEnfermedades() {
        return new ArrayList<>(enfermedades);
    }

    public List<Medicina> getMedicinas() {
        return new ArrayList<>(medicinas);
    }

    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
        actualizarEstado();
    }

    

    private Enfermedad buscarEnfermedad(String nombre) {
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    private boolean medicinaYaRecetada(String nombreMedicina) {
        for (Medicina m : medicinas) {
            if (m.getNombre().equalsIgnoreCase(nombreMedicina)) {
                return true;
            }
        }
        return false;
    }

    private void actualizarEstado() {
        this.estado = enfermedades.isEmpty();
    }
}