package colorlib.definitions;

import colorlib.steps.Diligenciar;
import colorlib.steps.PasoInicial;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AutenticacionDefinitions {

    @Steps
    public PasoInicial pasoInicial;

    @Steps
    Diligenciar diligenciar;

    @Given("^Yo Ingreso a la plataforma colorlib$")
    public void yo_Ingreso_a_la_plataforma_colorlib() {
        pasoInicial.abrirNavegador();
    }

    @When("^Yo me autentico con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void yo_me_autentico_con_usuario_y_clave(String usuario, String clave) {
        diligenciar.formularioAutenticacion(usuario, clave);
    }

    @Then("^Yo verifico el ingreso exitoso$")
    public void yo_verifico_el_ingreso_exitoso() {
        diligenciar.acceso();
    }

}
