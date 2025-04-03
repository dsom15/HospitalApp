
package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 * se crea la clase abstracta empleado
 * @author Dsoch
 * @since 03042025
 * @version 1.0.0
 */
 public abstract class Empleado {
     /**
      * nombre del empleado
      */
     private String nombre;
     /**
      * numero de docuemto de indentidad el empleado
      */
     private String numeroDocumento;
     /**
      * edad del empleado
      */
     private int edad;

    /**
     * salario base del empleado
     */
   

     private final double salarioBase=20000;
     private double salario;
     
     //constructor
    public Empleado(String nombre, String numeroDocumento, int edad) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salario = salario;
       
    }
    // metodo de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public double getSalarioBase() {
        return salarioBase;
    }
    
    
    
     // Metodo abstracto para que cada empleado
    public abstract double calcularSalario();


     
    
    
}
