package Main.Model;

import java.util.Date;

public class Pacientes {
    private String nombre;
    private String apellido;
    private String domicilio;
    private String DNI;
    private Date fechaDeAlta;

    public String getNombre() {
        return nombre;
    }

    public Pacientes(String nombre, String apellido, String domicilio, String DNI, Date fechaDeAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }


}
