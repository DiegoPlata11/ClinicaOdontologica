package Main.Model;

import org.apache.log4j.Logger;

public class Odontologo {

    private int id;
    private String apellido;
    private String nombre;
    private String Matricula;

    public Odontologo(int id, String apellido, String nombre, String matricula) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        Matricula = matricula;
    }
    public Odontologo(String apellido, String nombre, String matricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        Matricula = matricula;
    }

    private static final Logger LOGGER = Logger.getLogger(Odontologo.class);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public void listar(){

    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Matricula='" + Matricula + '\'' +
                '}';
    }
}
