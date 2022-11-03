package Main.Model;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ClinicaOdontologica {

    private String nombre;

    private List<Odontologo> listaOdontologos;

    private static final Logger LOGGER = Logger.getLogger(ClinicaOdontologica.class);
    public ClinicaOdontologica(String nombre) {
        this.nombre = nombre;
        this.listaOdontologos = new ArrayList<>();
    }

    public ClinicaOdontologica(String nombre, List<Odontologo> listaOdontologos) {
        this.nombre = nombre;
        this.listaOdontologos = listaOdontologos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarOdontologo(Odontologo odontologo){
        listaOdontologos.add(odontologo);
        LOGGER.info("Se agregó un odontólogo correctamente");
    }

    public void listarOdontologos(){
        if (listaOdontologos.size()==0){
            LOGGER.error("La lista de odontólogos esta vacía");
        }else {
            System.out.println(listaOdontologos);
        }
    }




}
