package colorlib.definitions;

import colorlib.models.UsuariosModels;
import colorlib.steps.Diligenciar;
import colorlib.steps.PasoInicial;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

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

    @When("^Yo me autentico con los siguientes datos$")
    public void yo_me_autentico_con_los_siguientes_datos(DataTable lista) {
        List<List<String>> datos = lista.raw();
        for(int i=1; i<datos.size(); i++) {
            diligenciar.paraDatosDeAutenticacion(datos, i);
        }
    }

    @When("^Yo me autentico con los datos$")
    public void yo_me_autentico_con_los_datos(DataTable lista) {
        List<List<String>> datos = lista.raw();
        for(int i=0; i<datos.size(); i++) {
            diligenciar.paraDatosDeAutenticacion(datos, i);
        }
    }

    @Then("^Yo verifico el mensaje$")
    public void yo_verifico_el_mensaje(DataTable lista) {
        List<List<String>> datos = lista.raw();
        for(int i=0; i<datos.size(); i++) {
            diligenciar.datoValidacion(datos, i);
        }
    }

    @When("^Yo me autentico con los datos de excel$")
    public void yo_me_autentico_con_los_datos_de_excel(DataTable lista) {
        List<List<String>> datos = lista.raw();
        for(int i=0; i<datos.size(); i++) {
            diligenciar.paraDatosDeAutenticacion(datos, i);
        }
    }


    @When("^Yo me autentico con los datos del modelo$")
    public void yo_me_autentico_con_los_datos_del_modelo(List<UsuariosModels> usuariosModels) {
            diligenciar.conDatosModelo(usuariosModels);
    }

    @Then("^Yo verifico el mensaje con el modelo de datos$")
    public void yo_verifico_el_mensaje_con_el_modelo_de_datos(List<UsuariosModels> usuariosModels) {
            diligenciar.validarResultado(usuariosModels);
    }
}
