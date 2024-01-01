package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.CarruselStep;

import java.util.List;

public class CarruselDefinition {

    @Steps
    private CarruselStep carruselstep;

    @Dado("que el usuario ingresa a la seccion sliders")
    public void queElUsuarioIngresaALaSeccionSliders() {
        carruselstep.ingresar();
        carruselstep.ingresoAlSlider();
    }
    @Cuando("arrastra el control deslizante hasta la posicion tres")
    public void arrastraElControlDeslizanteHastaLaPosicion() {
        carruselstep.moverSlider();
    }
    @Entonces("verifica que se muestra en el campo valor del slider, el numero de la posicion")
    public void verificaQueSeMuestraEnElCampoValorDelSliderElNumeroDeLaPosicion(List<String> datos) {
        carruselstep.verificarPosicion(datos.get(0));

    }


    }