package co.com.choucair.certification.reto6.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/exitoCompra.feature",
        tags = "@scenario",
        glue = "co.com.choucair.certification.reto6.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

