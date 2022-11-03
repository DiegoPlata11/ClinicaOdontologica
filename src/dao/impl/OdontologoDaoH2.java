package dao.impl;

import Main.Model.Odontologo;
import dao.IDaoOdontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OdontologoDaoH2 implements IDaoOdontologo {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/h2-database;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER ="root";
    private final static String DB_PASSWORD = "";




    @Override
    public Odontologo guardar(Odontologo odontologo) throws SQLException {
        LOGGER.debug("Registrando nuevo odontólogo: " + odontologo.toString());

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO odontologos(apellido,nombre,matricula) VALUES(?,?,?)");

            preparedStatement.setString(1, odontologo.getApellido());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getMatricula());

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return odontologo;
 }
    @Override
    //TODO terminar la implementación del metodo buscar
    public Odontologo buscar(Integer id) {
        return null;
    }
}
