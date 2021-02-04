package com.co.bancolombia.certificacion.utest.stepdefinitions;

import com.co.bancolombia.certificacion.utest.models.RegisterData;
import com.co.bancolombia.certificacion.utest.models.RegisterLocation;
import com.co.bancolombia.certificacion.utest.tasks.RegisterLocationOf;
import com.co.bancolombia.certificacion.utest.tasks.RegisterPersonalInfo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.co.bancolombia.certificacion.utest.utils.GetData.*;
import static com.co.bancolombia.certificacion.utest.utils.MyDriver.uTest;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStepDefinitions {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void init() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Juan");
    }
    @Given("that I want registering in utest")
    public void thatIWantRegisteringInUtest() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(uTest(driver)));
    }

    @When("I have filled the register form")
    public void iHaveFilledTheRegisterForm() throws IOException {
        RegisterData registerData = getDataUSer();
        RegisterLocation registerLocation = getDataLocation();
        theActorInTheSpotlight().attemptsTo(RegisterPersonalInfo.ofUser(registerData),
                RegisterLocationOf.user(registerLocation));
    }

    @Then("I would see the welcome message")
    public void iWouldSeeTheWelcomeMessage() {
    }
}
