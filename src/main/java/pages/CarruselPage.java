package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CarruselPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]")
    private WebElement btn_widgets;

    @FindBy(xpath = "//*[contains(text(), 'Slider')]")
    private WebElement btn_slider;
    @FindBy(xpath = "//*[@id=\"sliderContainer\"]/div[1]/span/input")
    private WebElement slider;
    @FindBy(id = "sliderValue")
    private WebElement txt_posicion;


    public void abrirPagina(){
        getDriver().navigate().to("https://demoqa.com");
        getDriver().manage().window().maximize();
    }

    public void ingresoAlSlider()
    {
        // Crear un objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        // Hacer scroll hacia abajo
        js.executeScript("window.scrollBy(0, 500);");

        btn_widgets.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0, 500);");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        btn_slider.click();
        System.out.println("Holaa123");

    }

    public void moverSlider(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtener el ancho del control deslizante
        int anchoControlDeslizante = slider.getSize().getWidth();

        // Calcular el valor correspondiente al 3 en el rango del control deslizante
        double valorTresEnRango = (-45.00 / 100) * anchoControlDeslizante;

        // Utilizar Actions para mover el control deslizante al valor 3
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(slider).moveByOffset((int) valorTresEnRango, 0).release().perform();
    }

    public String verificarPosicion() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println((txt_posicion).getAttribute("value"));

        return txt_posicion.getAttribute("value");
    }
}