package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoPage.*;

public class SearchVisitaDelPresidenteDelBID implements Task {

    public static SearchVisitaDelPresidenteDelBID toThe() {
        return Tasks.instrumented(SearchVisitaDelPresidenteDelBID.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COMUNICADOS_BUTTON),
                Click.on(NEWS_PIB_BUTTON),
                SwitchWindows.setWindow());
    }
}
