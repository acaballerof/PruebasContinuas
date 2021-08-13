package co.com.choucair.certification.PruebasContinuas.stepdefinitions;

import co.com.choucair.certification.PruebasContinuas.model.BanistmoPageData;
import co.com.choucair.certification.PruebasContinuas.questions.Answer;
import co.com.choucair.certification.PruebasContinuas.tasks.OpenUp;
import co.com.choucair.certification.PruebasContinuas.tasks.SearchTarifasDeCuentas;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TarifasDeCuentasStepDefinitions {
    @Before
    public void setStage(){setTheStage(new OnlineCast());}

    @Given("^than Tom wants to know the Tarifas de cuentas de Depósitos$")
    public void thanTomWantsToKnowTheTarifasDeCuentasDeDepósitos() {
        theActorCalled("Tom").wasAbleTo(OpenUp.thePage());
    }

    @When("^he seach for the PDF document$")
    public void heSeachForThePDFDocument() {
        theActorInTheSpotlight().attemptsTo(SearchTarifasDeCuentas.toThe());
    }

    @Then("^he find the PDF document about Tarifas de cuentas de Depósitos$")
    public void heFindThePDFDocumentAboutTarifasDeCuentasDeDepósitos(List<BanistmoPageData> banistmoPageData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(banistmoPageData.get(0))));
    }
}
