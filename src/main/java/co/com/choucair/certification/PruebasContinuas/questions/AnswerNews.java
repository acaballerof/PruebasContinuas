package co.com.choucair.certification.PruebasContinuas.questions;

import co.com.choucair.certification.PruebasContinuas.model.BanistmoPageData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerNews implements Question<Boolean> {
    BanistmoPageData banistmoPageData;

    public AnswerNews(BanistmoPageData banistmoPageData) {
        this.banistmoPageData = banistmoPageData;
    }

    public static AnswerNews toThe(BanistmoPageData banistmoPageData) {
        return new AnswerNews(banistmoPageData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();

        if (currentUrl.contains(banistmoPageData.getUrlVisitaDelBID())){
            result = true;
        }
        return result;
    }
}
