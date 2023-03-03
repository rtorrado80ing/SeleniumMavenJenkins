package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.FormularioPage;
//import pageobjects.FormularioPage;

public class BaseTest {

    private WebDriver driver;
    protected FormularioPage formularioPage;

    @BeforeClass

    public void setUp() {
        // Configuración del driver de Selenium
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        formularioPage = new FormularioPage(driver);
    }


    @AfterClass
    public void tearDown() {
        // Cerrar el navegador después de cada prueba
        //driver.quit();
    }

}

