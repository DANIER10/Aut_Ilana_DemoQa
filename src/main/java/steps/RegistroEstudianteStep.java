package steps;

import org.example.DataPrueba;
import org.testng.Assert;
import pages.RegistroEstudiantePage;

public class RegistroEstudianteStep {

    private RegistroEstudiantePage registroestudiantepage;

    public void ingresar()
    {
        registroestudiantepage.abrirPagina();
        //registroestudiantepage.open();

    }

    public void ingresoAlForm()
    {
        registroestudiantepage.ingresoAlForm();
    }
    public void registro(DataPrueba data)
    {
        registroestudiantepage.registro(data);
    }
    public void verificarRegistro(String mensaje) {
        String txt;
        txt =registroestudiantepage.verificarRegistro();

        //org.junit.Assert.assertEquals(texto, txt);
        Assert.assertEquals(mensaje, txt);

    }

}