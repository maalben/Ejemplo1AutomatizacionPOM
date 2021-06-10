package colorlib.steps;

import colorlib.pageobject.AutenticacionPageObject;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class Diligenciar {

    AutenticacionPageObject autenticacionPageObject;

    @Step
    public void formularioAutenticacion(String usuario, String clave) {
        autenticacionPageObject.usuario(usuario, clave);
    }

    @Step
    public void acceso() {
        autenticacionPageObject.home();
    }

    @Step
    public void paraDatosDeAutenticacion(List<List<String>> datos, int i) {
        String usuario = datos.get(i).get(0).trim();
        String clave = datos.get(i).get(1).trim();
        autenticacionPageObject.usuario(usuario, clave);
    }

    @Step
    public void datoValidacion(List<List<String>> datos, int i) {
        autenticacionPageObject.home(datos.get(i).get(0).trim());
    }
}
