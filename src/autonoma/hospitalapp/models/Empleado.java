
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
   

     private  double salarioBase;
     
     private double salario;
     
     //constructor
    public Empleado(String nombre, String numeroDocumento, int edad,double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
       
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

 
     public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
     // Metodo abstracto para que cada empleado
    public abstract double calcularSalario();


     
    
    
}
