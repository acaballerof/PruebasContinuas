package co.com.choucair.certification.PruebasContinuas.tasks;

import co.com.choucair.certification.PruebasContinuas.interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.PruebasContinuas.userinterface.BanistmoPage.*;

public class SearchTarifasDeCuentas implements Task {


    public static SearchTarifasDeCuentas toThe() {
        return Tasks.instrumented(SearchTarifasDeCuentas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TARIFARIO_BUTTON),
        Click.on(TARIFAS_DE_CUENTA_DEPOSITOS_PDF),
        SwitchWindows.setWindow());
    }
}
