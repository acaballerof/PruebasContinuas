package co.com.choucair.certification.PruebasContinuas.stepdefinitions;

import co.com.choucair.certification.PruebasContinuas.model.BanistmoPageData;
import co.com.choucair.certification.PruebasContinuas.questions.AnswerNews;
import co.com.choucair.certification.PruebasContinuas.tasks.OpenUp;
import co.com.choucair.certification.PruebasContinuas.tasks.SearchVisitaDelPresidenteDelBID;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VisitaDelPresidenteDelBIDStepDefinitions {
    @Before
    public void SetStage() { setTheStage(new OnlineCast());}

    @Given("^than Tom wants to reed the news about the visita del presidente del BID$")
    public void thanTomWantsToReedTheNewsAboutTheVisitaDelPresidenteDelBID() {
        theActorCalled("Tom").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the PDF document$")
    public void heSearchForThePDFDocument(){
        theActorInTheSpotlight().attemptsTo(SearchVisitaDelPresidenteDelBID.toThe());
    }

    @Then("^he find the News about visita del presidente del BID$")
    public void heFindTheNewsAboutVisitaDelPresidenteDelBID(List<BanistmoPageData> banistmoPageData){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerNews.toThe(banistmoPageData.get(0))));
    }
}
