package autonoma.hospitalapp.main;

import autonoma.hospitalapp.models.EscritorArchivoTextoPlano;
import autonoma.hospitalapp.models.Gerente;

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

    public static void main(String[] args) throws IOException {

        Hospital hospital = new Hospital();
        Gerente gerente = new Gerente();
        Localizacion localizacion = new Localizacion();

        hospital.leerTextoHospital();
        hospital.leerTextoGerente();
        hospital.leerTextoLocalizacion();
        Nomina nomina = new Nomina(hospital.getEmpleados());
        nomina.guardarEnArchivo("nomina.txt", new EscritorArchivoTextoPlano());

        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        ventana.setVisible(true);

    }

}
