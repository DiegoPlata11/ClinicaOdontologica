package Main.Model;

import java.util.Date;

public class Turnos {

    private Date fechaTurno;
    private String horaTurno;

    public Turnos(Date fechaTurno, String horaTurno) {
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }



}
