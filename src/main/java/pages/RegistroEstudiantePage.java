package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.example.DataPrueba;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

//@DefaultUrl("https://demoqa.com/")

public class RegistroEstudiantePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    private WebElement btn_formularios;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")
    private WebElement btn_practiceform;

    @FindBy(id = "firstName")
    private WebElement txt_firstname;

    @FindBy(id = "lastName")
    private WebElement txt_lastname;

    @FindBy(id = "userEmail")
    private WebElement txt_email;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]")
    private WebElement radiobut_hombre;

    @FindBy(id = "userNumber")
    private WebElement txt_numero;

    @FindBy(id = "dateOfBirthInput")
    private WebElement txt_cumpleanos;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement lbl_registro;

    public void abrirPagina(){
        getDriver().navigate().to("https://demoqa.com");
        getDriver().manage().window().maximize();
    }

    public void ingresoAlForm()
    {
        // Crear un objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        // Hacer scroll hacia abajo
        js.executeScript("window.scrollBy(0, 500);");

        btn_formularios.click();
        System.out.println("Holaa123");
        btn_practiceform.click();
    }

    public void registro(DataPrueba data)
    {

        txt_firstname.sendKeys(data.getNombre());
        txt_lastname.sendKeys(data.getApellido());
        txt_email.sendKeys(data.getCorreo());
        System.out.println("1");
        radiobut_hombre.click();
        System.out.println("2");
        txt_numero.sendKeys(data.getNumero());
        System.out.println("3");
        txt_cumpleanos.sendKeys(data.getCumpleanos());
        System.out.println("4");
        txt_cumpleanos.submit();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       // btn_enviar.submit();

    }

    public String verificarRegistro() {

        System.out.println((lbl_registro).getText());

        return lbl_registro.getText();
    }
}