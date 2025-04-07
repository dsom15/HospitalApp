package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DeclararQuiebraException;
import java.util.ArrayList;
import java.util.Date;

/**
 * se crea la clase nomina
 *
 * @author Dsoch
 * @serial 03042025
 * @version 1.0.0
 */
public class Nomina {

    /**
     * id de la nomina
     */
    private int id;

    private static int contadorId = 1;

    /**
     * fecha de creacion de la nomina
     */
    private Date fecha;
    /**
     * salario total de los empleados
     */
    private double totalSalarioNomina;
    /**
     * lista de los empleados
     */
    private ArrayList<Empleado> empleados;

    public Nomina(ArrayList<Empleado> empleados) {
        this.id = contadorId++;
        this.fecha = new Date();
        this.empleados = empleados;
        this.totalSalarioNomina = calcularTotalSalario();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalSalarioNomina() {
        return totalSalarioNomina;
    }

    public void setTotalSalarioNomina(double totalSalarioNomina) {
        this.totalSalarioNomina = totalSalarioNomina;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Método para calcular el salario
     *
     * @return salario total de los trabajadores
     */
    private double calcularTotalSalario() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

    /**
     * Método para generar la nomina de los empleados y descontarla del
     * presupuesto
     *
     * @param hospital
     */
    /**
     * Método para generar la nómina de los empleados y actualizar la fecha.
     */
    public void generarNomina() {
        this.totalSalarioNomina = calcularTotalSalario();
        this.fecha = new Date();
    }
    /**
     * Método para descontar el salrio del presupuesto
     * @param hospital
     * @throws DeclararQuiebraException 
     */
    public void descontarNomina(Hospital hospital) throws DeclararQuiebraException {
        hospital.setPresupuesto(hospital.getPresupuesto() - this.totalSalarioNomina);

        if (hospital.getPresupuesto() < 0) {
            hospital.setEstado(false);
            throw new DeclararQuiebraException();
        }
    }

}
