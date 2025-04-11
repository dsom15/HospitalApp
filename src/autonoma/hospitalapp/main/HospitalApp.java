package autonoma.hospitalapp.main;

import autonoma.hospitalapp.models.Gerente;
import autonoma.hospitalapp.models.MetodosArchivos;
import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Localizacion;
import autonoma.hospitalapp.models.Nomina;
import autonoma.hospitalapp.views.VentanaPrincipal;
import java.io.IOException;

/**
 * Se crea el main
 *
 * @author Dsoch
 * @since 02042025
 * @version 1.0.0
 *
 */
public class HospitalApp {

    public static void main(String[] args) {
        
        Hospital hospital= new Hospital();
        Gerente gerente = new Gerente();
        Localizacion localizacion= new Localizacion();
        /**
         * las urls de los archivos de texto plano que se van a crear
         */
        
        String directorio = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp";
        String archivoNomina = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\nomina.txt";

        MetodosArchivos ma = new MetodosArchivos();
        /**
         * se crea el archivo hospital con su contenido
         */
       

     
       
        /**
         * se crea el archivo para la nomina
         */

        // ma.guardarNomina(archivoNomina, nomina);
         hospital.leerTextoHospital();
         hospital.leerTextoGerente();
         hospital.leerTextoLocalizacion();
        
        
        
        
        
        
        
       
        Nomina nomina = new Nomina(hospital.getEmpleados());

       // Guardar la nómina en el archivo
        ma.guardarNomina(archivoNomina, nomina);

        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        ventana.setVisible(true);

    }

}
