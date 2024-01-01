package steps;

import org.testng.Assert;
import pages.CarruselPage;

public class CarruselStep {

    private CarruselPage carruselpage;

    public void ingresar()
    {
        carruselpage.abrirPagina();
    }

    public void ingresoAlSlider()
    {
        carruselpage.ingresoAlSlider();
    }
    public void moverSlider()
    {
        carruselpage.moverSlider();
    }
    public void verificarPosicion(String posicion) {
        String txt;
        txt =carruselpage.verificarPosicion();

        //org.junit.Assert.assertEquals(texto, txt);
        Assert.assertEquals(posicion, txt);


    }

}