import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class probando {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=2q1B6j92KsM&list=RD2q1B6j92KsM&start_radio=1");
        driver.manage().window().maximize();
        //driver.quit();

    }

}
