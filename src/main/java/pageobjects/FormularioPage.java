package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FormularioPage {
    private WebDriver driver;

    private By INPUT_FIRST_NAME = By.id("first-name");
    private By INPUT_LAST_NAME = By.id("last-name");
    private By RDB_LEVEL_EDUCATION = By.id("radio-button-1");

    public void firstNameInput(String name) throws InterruptedException {
        WebElement firstNameInput = driver.findElement(INPUT_FIRST_NAME);
        firstNameInput.sendKeys(name);
    }

    @Deprecated
    public void lastNameInput(String lastName) throws InterruptedException {
        WebElement firstNameInput = driver.findElement(INPUT_LAST_NAME);
        firstNameInput.sendKeys(lastName);
    }

    public void rbnLevelEducation() throws InterruptedException {
        WebElement levelEducation = driver.findElement(RDB_LEVEL_EDUCATION);
        levelEducation.click();
    }

    /*Contructor*/
    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

}
