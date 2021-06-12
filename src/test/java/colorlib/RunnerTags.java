package colorlib;

import colorlib.utilites.BeforeSuite;
import colorlib.utilites.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

//@RunWith(CucumberWithSerenity.class)
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion.feature",
        glue = "colorlib.definitions",
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTags {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/autenticacion.feature");
    }
}
