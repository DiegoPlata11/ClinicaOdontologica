package Main;

import Main.Model.ClinicaOdontologica;
import Main.Model.Odontologo;
import Service.OdontologoService;
import dao.IDaoOdontologo;
import dao.impl.OdontologoDaoH2;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        IDaoOdontologo dao = new OdontologoDaoH2();
        OdontologoService service = new OdontologoService();

        try {

            ClinicaOdontologica clinica = new ClinicaOdontologica("Oral DC");
            Odontologo odontologo1 = new Odontologo("Nomezqui", "Ana", "123456");
            Odontologo odontologo2 = new Odontologo("Perez", "Pablo", "457890");
            Odontologo odontologo3 = new Odontologo("Martinez", "Oscar", "2323568");


            clinica.agregarOdontologo(odontologo1);
            clinica.agregarOdontologo(odontologo2);
            clinica.agregarOdontologo(odontologo3);

            clinica.listarOdontologos();
            service.guardar(odontologo1);
            service.guardar(odontologo2);
            service.guardar(odontologo3);

        }
        catch (Exception e){
            LOGGER.error("Los datos del odontologo estan incompletos o son incorrectos");

        }

    }
}
