package co.com.choucair.certification.PruebasContinuas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchWindows implements Interaction {
    public static SwitchWindows setWindow(){ return new SwitchWindows();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
            Set<String> theWindow = driver.getWindowHandles();
            for (String currWindow:theWindow){
                driver.switchTo().window(currWindow);
            }
    }
}
