/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * se crea la clase localizacion
 * @author Dsoch
 * @since 03042025
 * @version 1.0.0
 */
public class Localizacion {
    private double latitud;
    private double longitud;
    //  constructor 
    public Localizacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    public Localizacion() {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    // metodos de acceso 
    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
    
}
