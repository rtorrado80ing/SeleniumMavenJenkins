package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class base {
    WebDriver driver;
    String url = "https://www.google.com/";
    String email = "ejemplo@ejemplo.com";
    String password = "contraseña123";


    @BeforeClass
    public void setUp() {
        // Configuración del driver de Selenium
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void testLogin() {
        // Buscar los elementos de inicio de sesión
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Dragonball");
        searchInput.submit();
    }

    @AfterClass
    public void tearDown() {
        // Cerrar el navegador después de cada prueba
        driver.quit();
    }

}

