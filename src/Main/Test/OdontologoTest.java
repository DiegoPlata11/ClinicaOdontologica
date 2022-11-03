package Main.Test;

import Main.Model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoTest {
    @Test

    public void verificarApellidoOdontologo_SeEsperaQueNoEsteVacio(){
        //GIVEN
        Odontologo O1 = new Odontologo("Suarez","Andres", "123456");

        //WHEN
        String resultado = O1.getApellido();

        //THEN
        Assertions.assertTrue(resultado.length()>0);
    }

    @Test

    public void verificarNombreOdontologo_SeEsperaQueNoEsteVacio(){
        //GIVEN
        Odontologo O1 = new Odontologo("Castro","Marcelo", "456896");

        //WHEN
        String resultado = O1.getNombre();

        //THEN
        Assertions.assertTrue(resultado.length()>0);

    }

    @Test

    public void verificarMatriculaOdontologo_SeEsperaQueNoEsteVacio(){
        //GIVEN
        Odontologo O1 = new Odontologo("Martinez","Lucas", "789456");

        //WHEN
        String resultado = O1.getMatricula();

        //THEN
        Assertions.assertTrue(resultado.length()>0);
    }

    }


