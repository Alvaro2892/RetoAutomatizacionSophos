package co.com.certification.RetoSophos.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoSophosWong.feature",
        glue = {"co.com.certification.RetoSophos.stepdefinitions","co.com.certification.RetoSophos.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags
{
}
