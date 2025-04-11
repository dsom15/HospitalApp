package autonoma.hospitalapp.models;

/**
 * se crea la clase empleado operativo
 *
 * @author Dsoch
 * @since 03042025
 * @version 1.0.0
 */
public class EmpleadoOperativo extends Empleado {

    /**
     * area en la que trabaja el empleado
     */
    private String areaTrabajo;

    //Constructor
    public EmpleadoOperativo(String areaTrabajo, String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }

    //Metodo de acceso
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    /**
     * se calcula el salario del empleado operativo
     *
     * @return salario a pagar del empleado
     */
    @Override
    public double calcularSalario() {
        double operativo = 0.2;
        double salario = (getSalarioBase() * operativo) + getSalarioBase();
        return salario;
    }

    @Override
    public String toString() {
        return "TipoEmpleado:Operativo,Nombre: " + this.getNombre()
                + ", Documento: " + this.getNumeroDocumento()
                + ", Edad: " + this.getEdad()
                + ", Salario Base: " + this.getSalarioBase()
                + ", Área de Trabajo: " + this.getAreaTrabajo();
    }

}
