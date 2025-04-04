package autonoma.hospitalapp.main;

import autonoma.hospitalapp.models.MetodosArchivos;
import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Nomina;

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
        /**
         * las urls de los archivos de texto plano que se van a crear
         */
        String archivoHospital = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\hospital.txt";
        String directorio = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp";
        String archivoLocalizacion = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\localizacion.txt";
        String archivoGerente = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\gerente.txt";
        String archivoNomina = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\nomina.txt";
        

        MetodosArchivos ma = new MetodosArchivos();
        /**
         * se crea el archivo hospital con su contenido
         */
        ma.crearArchivo(archivoHospital);
        ma.escribirArchivo(archivoHospital, "Nombre: Hospital San Jose St. Bonaventure\n");
        ma.escribirArchivo(archivoHospital, "Direccion: 2425 Samaritan Dr, San Jose, CA 95124 Estados Unidos\n");
        ma.escribirArchivo(archivoHospital, "Telefono: +1 408-559-2011\n");
        ma.escribirArchivo(archivoHospital, "Presupuesto: 1000000\n");
        ma.escribirArchivo(archivoHospital, "Fecha de Fundacion: 1965\n");

        ma.leerArchivo(archivoHospital);

        /**
         * se crea el archivo localizacion
         */
        ma.crearArchivo(archivoLocalizacion);
        ma.escribirArchivo(archivoLocalizacion, "Latitud: 37.25157313140872\n");
        ma.escribirArchivo(archivoLocalizacion, "Longitud: -121.94667417922749\n");

        /**
         * se crea el archivo gerente
         */
        ma.crearArchivo(archivoGerente);
        ma.escribirArchivo(archivoGerente, "Nombre: Aaron Glassman\n");
        ma.escribirArchivo(archivoGerente, "Numero de documento: 84.941.564\n");
        ma.escribirArchivo(archivoGerente, "Edad: 69\n");
        ma.escribirArchivo(archivoGerente, "Carrera: Neurocirujano\n");
        /**
         * se crea el archivo para la nomina
         */
        
       // ma.guardarNomina(archivoNomina, nomina);

    }

}
