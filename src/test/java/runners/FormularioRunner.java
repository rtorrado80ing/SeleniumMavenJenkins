package runners;

import base.BaseTest;
import org.testng.annotations.Test;

public class FormularioRunner extends BaseTest {
    @Deprecated
    @Test
    public void form() throws InterruptedException {
        formularioPage.firstNameInput("Jorge");
        formularioPage.lastNameInput("Saganome");
        formularioPage.rbnLevelEducation();
    }
}
