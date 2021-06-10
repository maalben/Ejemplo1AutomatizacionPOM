package colorlib.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class AutenticacionPageObject extends PageObject {


    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade txtUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade txtPassword;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElementFacade btnSubmit;

    @FindBy(id = "bootstrap-admin-template")
    public WebElementFacade lblHome;

    public void usuario(String usuario, String clave) {
        txtUsername.sendKeys(usuario);
        txtPassword.sendKeys(clave);
        btnSubmit.click();
    }

    public void home() {
        String mensajeEsperado = "Bootstrap-Admin-Template";
        String mensajeMapeo = lblHome.getText();
        Assert.assertEquals(mensajeEsperado, mensajeMapeo);
        MatcherAssert.assertThat(mensajeEsperado, Matchers.equalTo(mensajeMapeo));
    }

    public void home(String respuesta) {
        String mensajeEsperado = respuesta;
        String mensajeMapeo = lblHome.getText();
        Assert.assertEquals(mensajeEsperado, mensajeMapeo);
        MatcherAssert.assertThat(mensajeEsperado, Matchers.equalTo(mensajeMapeo));
    }
}


