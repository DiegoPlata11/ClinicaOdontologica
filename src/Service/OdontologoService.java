package Service;

import Main.Model.Odontologo;
import dao.IDaoOdontologo;
import dao.impl.OdontologoDaoH2;

import java.sql.SQLException;

public class OdontologoService {

    private IDaoOdontologo odontologoDao;

    public OdontologoService() {
        this.odontologoDao = new OdontologoDaoH2();
    }

    public Odontologo guardar (Odontologo odontologo) throws SQLException {
        return odontologoDao.guardar(odontologo);
    }

    public  Odontologo buscar(Integer id){
        return odontologoDao.buscar(id);
    }

}
