package co.com.certification.RetoSophos.stepdefinitions;

import co.com.certification.RetoSophos.model.InitializeObjects;
import co.com.certification.RetoSophos.tasks.ComeIn;
import co.com.certification.RetoSophos.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoSophosWong
{

    @Given("^that the user wants to buy an item$")
    public void thatTheUserWantsToBuyAnItem()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @When("^he enters the Wong Cencosud website$")
    public void heEntersTheWongCencosudWebsite(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(ComeIn.WebSite(data));
    }

    @Then("^he verifies that the purchase was made$")
    public void heVerifiesThatThePurchaseWasMade()
    {

    }
}
