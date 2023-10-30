package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.interactions.FillRegisterForm;
import co.com.choucair.certification.utest.model.User;
import co.com.choucair.certification.utest.questions.AnswerConfirmRegister;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class RegisterUserStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user enters the uTest page$")
    public void that_the_user_enters_the_uTest_page() {
        theActorCalled("Miguel").wasAbleTo(EnterHomeUTest.openPage());
    }

    @When("^a user fills out the registration form correctly$")
    public void a_user_fills_out_the_registration_form_correctly(List<User> user) {
        theActorInTheSpotlight().attemptsTo(
                FillRegisterForm.withUser(user)
        );
    }

    @Then("^the registration is successful$")
    public void the_registration_is_successful(List<User> user) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerConfirmRegister.toThe(user)));
    }
}
