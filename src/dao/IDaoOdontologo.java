package dao;

import Main.Model.Odontologo;

import java.sql.SQLException;

public interface IDaoOdontologo {

    public Odontologo guardar(Odontologo odontologo) throws SQLException;
    public Odontologo buscar(Integer id);
    }

