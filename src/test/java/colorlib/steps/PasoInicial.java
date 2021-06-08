package colorlib.steps;

import colorlib.pageobject.AutenticacionPageObject;
import net.thucydides.core.annotations.Step;

public class PasoInicial {

    AutenticacionPageObject autenticacionPageObject;

    @Step
    public void abrirNavegador() {
        autenticacionPageObject.open();
    }
}
