package colorlib.steps;

import colorlib.pageobject.AutenticacionPageObject;
import net.thucydides.core.annotations.Step;

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
}
