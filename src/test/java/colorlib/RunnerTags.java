package colorlib;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion.feature",
        glue = "colorlib.definitions",
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTags {
}
