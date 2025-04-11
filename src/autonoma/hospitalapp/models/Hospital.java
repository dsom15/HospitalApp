package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DeclararQuiebraException;
import autonoma.hospitalapp.exceptions.MalaFormulacionException;
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
    /**
     * atributo inventarioFarmacia
     */
    private InventarioFarmacia inventarioFarmacia;
    /**
     * lista de pacientes
     *
     */
    private ArrayList<Paciente> pacientes;

    //Constructor
    public Hospital(double metaDeventasAnual, boolean estado, Gerente gerente, Localizacion localizacion) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
        this.inventarioFarmacia = new InventarioFarmacia();
        this.pacientes = new ArrayList<>();
    }

    public Hospital() {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
        this.inventarioFarmacia = new InventarioFarmacia();
        this.pacientes = new ArrayList<>();
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

    public InventarioFarmacia getInventarioFarmacia() {
        return inventarioFarmacia;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
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
     *
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

    /**
     * metodo para leer los archivos de texto plano
     */
    public void leerTextoHospital() {
        Lector lector = new LectorArchivoTextoPlano();
        try {
            ArrayList<String> archivo = lector.leer("hospita.txt");

            for (String lineaCompleta : archivo) {
                String[] lineas = lineaCompleta.split(",");
                for (String linea : lineas) {
                    String[] partes = linea.split(":");

                    if (partes.length == 2) {
                        String clave = partes[0].trim();
                        String valor = partes[1].trim();

                        if (clave.equals("Nombre")) {
                            this.nombre = valor;
                        } else if (clave.equals("Direccion")) {
                            this.direccion = valor;
                        } else if (clave.equals("Telefono")) {
                            this.telefono = valor;
                        } else if (clave.equals("Presupuesto")) {
                            this.presupuesto = Double.parseDouble(valor);
                        } else if (clave.equals("Fecha de Fundacion")) {
                            this.fechaFundacion = valor;
                        }
                    }
                }
            }
<<<<<<< HEAD
            System.out.println("como" + getNombre());
=======
            System.out.println("como " + getNombre());
>>>>>>> edc46e7ddba7d9c918e66e6b300cd3dccb4a03e8
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Error al leer archivo del hospital: " + e.getMessage());
        }
    }
<<<<<<< HEAD
    // Metodo CRUD para pacientes

    /**
=======

    /**
     * metodo para leer y asiganar atributos del gerente
     */
    public Gerente leerTextoGerente() {
        Lector lector = new LectorArchivoTextoPlano();
        Gerente gerente = new Gerente();
        try {
            ArrayList<String> lineas = lector.leer("gerente.txt");

            for (String linea : lineas) {
                String[] partes = linea.split(":");

                if (partes.length == 2) {
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    if (clave.equals("Nombre")) {
                        gerente.setNombre(valor);
                    } else if (clave.equals("NumeroDeDocumento")) {
                        gerente.setDocumentoIdentidad(valor);
                    } else if (clave.equals("Edad")) {
                        gerente.setEdad(Integer.parseInt(valor));
                    } else if (clave.equals("Carrera")) {
                        gerente.setCarrera(valor);
                    }
                }
            }
            this.gerente = gerente;

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo del gerente: " + e.getMessage());
        }
        return gerente;
    }
    /**
     * metodo para leer y asiganar atributos del localizacion
     */
    public void leerTextoLocalizacion() {
        Lector lector = new LectorArchivoTextoPlano();
        this.localizacion = new Localizacion();
        try {
            ArrayList<String> lineas = lector.leer("localizacion.txt");

            for (String linea : lineas) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    if (clave.equals("Latitud")) {
                        this.localizacion.setLatitud(Double.parseDouble(valor));
                    } else if (clave.equals("Longitud")) {
                        this.localizacion.setLongitud(Double.parseDouble(valor));
                    }
                }
            }
            
            

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo de localización: " + e.getMessage());
        }
    }

    // Metodo CRUD para pacientes
    /**
>>>>>>> edc46e7ddba7d9c918e66e6b300cd3dccb4a03e8
     * Agrega un nuevo paciente al sistema
     *
     * @param p Paciente a agregar
     * @return true si se agregó correctamente
     */
    public boolean agregarPaciente(Paciente p) {
        if (p == null || buscarPacientePorNombre(p.getNombre()) != null) {
            return false; 
        }
        return this.pacientes.add(p);
    }

    /**
     * Elimina un paciente por nombre
     *
     * @param nombre Nombre del paciente a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarPaciente(String nombre) {
        return pacientes.removeIf(paciente -> paciente.getNombre().equalsIgnoreCase(nombre));
    }

    /**
     * Busca un paciente por nombre 
     *
     * @param nombre Nombre completo o parcial a buscar
     * @return Paciente encontrado o null si no existe
     */
    public Paciente buscarPacientePorNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return null;
        }

        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equalsIgnoreCase(nombre)) {
                return paciente;
            }
        }
        return null;
    }

    /**
     * Actualiza el nombre de un paciente
     *
     * @param nombreActual Nombre actual del paciente
     * @param nuevoNombre Nuevo nombre a asignar
     * @return true si se actualizó, false si no se encontró
     */
    public boolean actualizarPaciente(String nombreActual, String nuevoNombre) {
        Paciente paciente = buscarPacientePorNombre(nombreActual);
        if (paciente != null) {
            paciente.setNombre(nuevoNombre);
            return true;
        }
        return false;
    }

    /**
     * Muestra lista de pacientes
     *
     * @return Lista con datos de los pacientes
     */
    public String mostrarPacientes() {
        StringBuilder resultado = new StringBuilder();
        for (Paciente p : pacientes) {
            resultado.append(p.getNombre()).append(" - ")
                    .append(p.getEdad()).append(" años - ")
                    .append(p.isSaludable() ? "Sano" : "Enfermo").append("\n");
        }
        return resultado.toString();
    }

    /**
     * Registra una enfermedad a un paciente
     *
     * @param nombre Nombre del paciente
     * @param enfermedad Enfermedad a registrar
     * @return true si se registró, false si no se encontró
     */
    public boolean registrarEnfermedadPaciente(String nombre, Enfermedad enfermedad) {
        Paciente paciente = buscarPacientePorNombre(nombre);
        if (paciente != null) {
            paciente.agregarEnfermedad(enfermedad);
            return true;
        }
        return false;
    }

    /**
     * Trata una enfermedad de un paciente con una medicina
     *
     * @param nombre Nombre del paciente
     * @param medicina Medicina a administrar
     * @param nombreEnfermedad Enfermedad a tratar
     * @return true si se trató, false si hubo error
     */
    public boolean tratarEnfermedadPaciente(String nombre, Medicina medicina, String nombreEnfermedad) {
        try {
            Paciente paciente = buscarPacientePorNombre(nombre);
            if (paciente != null) {
                paciente.curarEnfermedad(medicina, nombreEnfermedad);
                return true;
            }
        } catch (MalaFormulacionException e) {
            System.err.println("Error al tratar enfermedad: " + e.getMessage());
        }
        return false;
    }

    /**
     * metodo para obtner los empleados
     *
     * @return
     */
    public ArrayList<String> obtenerDatosEmpleadosComoTexto() {
        ArrayList<String> datos = new ArrayList<>();
        for (Empleado e : this.empleados) {
            datos.add(e.toString());
        }
        return datos;
    }

}
