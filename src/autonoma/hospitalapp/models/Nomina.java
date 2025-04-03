package autonoma.hospitalapp.models;

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
        this.fecha = fecha;
        this.empleados = empleados;
        this.totalSalarioNomina = totalSalarioNomina;

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
     * metodo para calcular el salario
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
     * merodo para generar la nomina de los empleados y descontarla del presupuesto
     * @param hospital 
     */
    public void generarNomina(Hospital hospital) {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }

        hospital.setPresupuesto(hospital.getPresupuesto() - total);
        this.totalSalarioNomina = total;
        this.fecha = new Date();

        
    }

}
