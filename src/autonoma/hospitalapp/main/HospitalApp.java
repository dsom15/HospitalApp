
package autonoma.hospitalapp.main;
import autonoma.hospitalapp.models.MetodosArchivos;

/**
 * Se crea el main
 * @author Dsoch
 * @since 02042025
 * @version 1.0.0
 * 
 */
public class HospitalApp {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\Dsoch\\OneDrive\\Desktop\\estudio\\Programacion orientada a objetos\\Clase 3\\HospitalApp\\archivo.txt";
        MetodosArchivos ma = new MetodosArchivos ();
        ma.crearArchivo(archivo);
        ma.escribirArchivo(archivo, "Esta es la primera linea de texto");
    }
 
}
