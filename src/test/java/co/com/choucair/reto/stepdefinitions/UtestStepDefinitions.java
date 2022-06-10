package co.com.choucair.reto.stepdefinitions;

import co.com.choucair.reto.model.UserInformationUtest;
import co.com.choucair.reto.questions.Answer;
import co.com.choucair.reto.tasks.OpenUp;
import co.com.choucair.reto.tasks.UtestRegistration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to register on the Utest page$")
    public void thanJuanWantsToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters the information on the Utest page$")
    public void heEntersTheInformationOnTheUtestPage(List<UserInformationUtest> userInformationUtest) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestRegistration.theInformation(
                userInformationUtest.get(0).getStrName(),
                userInformationUtest.get(0).getStrLastName(),
                userInformationUtest.get(0).getStrEmail(),
                userInformationUtest.get(0).getStrCity(),
                userInformationUtest.get(0).getStrPassword(),
                userInformationUtest.get(0).getStrConfirmPassword()));
    }

    @Then("^he should show a message of welcome$")
    public void heShouldShowAMessageOfWelcome(List <UserInformationUtest> userInformationUtest) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(userInformationUtest.get(0).getStrConfirmRegister())));

    }
}
