package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DeclararQuiebraException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Se crea la clase Hospital
 *
 * @author Dsoch
 * @since 2042025
 * @version 1.0.0
 * @
 */
public class Hospital {

    //atributos 
    /**
     * Nombre del Hospital
     */
    private String nombre;
    /**
     * Direccion del Hospital
     */
    private String direccion;
    /**
     * Telefono de contacto del Hospital
     */
    private String telefono;
    /**
     * Presupuesto del Hospital
     */
    private double presupuesto;
    /**
     * Meta de la ventas del Hospital
     */
    private double metaDeventasAnual;
    /**
     * Fecha de la creacion de la fundacion
     */
    private String fechaFundacion;
    /**
     * Estado si es en quiebra o no del Hospital
     */
    private boolean estado;
    /**
     * de la clase gerente
     */
    private Gerente gerente;
    /**
     * de la clase localizacion
     */
    private Localizacion localizacion;
    /**
     * lista de empleados
     *
     */
    private ArrayList<Empleado> empleados;

    /**
     *
     * clase nomina
     */
    private Nomina nomina;

    //Constructor
    public Hospital(double metaDeventasAnual, boolean estado, Gerente gerente, Localizacion localizacion) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    public Hospital() {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    //Metodos de acceso 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMetaDeventasAnual() {
        return metaDeventasAnual;
    }

    public void setMetaDeventasAnual(double metaDeventasAnual) {
        this.metaDeventasAnual = metaDeventasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

      public void aumentarPresupuesto(double precioVenta) {
        this.presupuesto += precioVenta;
    }

      public void descontarPresupuesto(double costo) {
        this.presupuesto -= costo;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    // metodos crud de empleado
    /**
     * metodo agregar empleado
     *
     * @param e
     * @return e
     */
    public boolean agregarEmpleado(Empleado e) {
        return this.empleados.add(e);

    }

    /**
     * eliminar empleado por documento
     *
     * @param numeroDocumento
     * @return true o false
     */
    public boolean eliminarEmpleado(String numeroDocumento) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNumeroDocumento().equals(numeroDocumento)) {
                empleados.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * merodo de buscar empleado por cedula
     *
     * @param numeroDocumento
     * @return empleado
     */
    public Empleado buscarEmpleadoPorDocumento(String numeroDocumento) {
        for (Empleado empleado : empleados) {
            if (empleado.getNumeroDocumento().equalsIgnoreCase(numeroDocumento)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * actualizar empleado
     *
     * @param numeroDocumento
     * @param nuevoNombre
     * @return true o false
     */
    public boolean actualizarEmpleado(String numeroDocumento, String nuevoNombre) {
        for (Empleado e : empleados) {
            if (e.getNumeroDocumento().equals(numeroDocumento)) {
                e.setNombre(nuevoNombre);
                return true;
            }
        }
        return false;
    }

    /**
     * muestra la lista de empleados
     *
     * @return
     */
    public String mostrarEmpleado() {
        String lista = "";
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado e = this.empleados.get(i);
            lista += e.toString() + "\n";
        }
        return lista;
    }

    /**
     * Métodos de gestión nomina
     * @throws DeclararQuiebraException 
     */
    public void procesarNomina() throws DeclararQuiebraException {
        try {
            this.nomina.generarNomina(); 
            this.nomina.descontarNomina(this);
        } catch (DeclararQuiebraException e) {
            this.estado = false;
            throw e;
        }
    }
    
<<<<<<< HEAD
=======
    public void leerDesdeArchivo(String ruta) {
    Lector lector = new LectorArchivoTextoPlano();
    try {
        ArrayList<String> archivo = lector.leer(ruta);
        for (String linea : archivo) {
            String[] partes = linea.split(";");
            this.nombre = partes[0];
            this.direccion = partes[1];
            this.telefono = partes[2];
            this.presupuesto = Double.parseDouble(partes[3]);
            this.fechaFundacion = partes[4];
        }
    } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
        System.err.println("Error al leer archivo del hospital: " + e.getMessage());
    }
}
>>>>>>> 5f7e3a0f076131766e794532e740e06921047eb3

}
