package co.com.choucair.certification.PruebasContinuas.questions;

import co.com.choucair.certification.PruebasContinuas.model.BanistmoPageData;
import cucumber.api.java.en_scouse.An;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Answer implements Question<Boolean> {
BanistmoPageData banistmoPageData;

    public Answer(BanistmoPageData banistmoPageData) {
        this.banistmoPageData = banistmoPageData;
    }

    public static Answer toThe(BanistmoPageData banistmoPageData) {
        return new Answer(banistmoPageData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (currentUrl.contains(banistmoPageData.getUrlTarifasCuentasDepositos())){
            result = true;
        }
        return result;
    }
}
