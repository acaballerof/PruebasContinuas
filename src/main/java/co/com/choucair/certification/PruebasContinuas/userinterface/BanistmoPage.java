package co.com.choucair.certification.PruebasContinuas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BanistmoPage {

    public static final Target TARIFARIO_BUTTON = Target.the("Where the user click the tarifario button")
            .located(By.xpath("//*[@id='footer-content']/div[2]/div/div/div[2]/div/ul/li[5]/a"));
    public static final Target TARIFAS_DE_CUENTA_DEPOSITOS_PDF= Target.the("Where the user click to open the PDF doc about tarifas de cuentas de depositos")
            .located(By.xpath("//*[@id='layoutContainers']/div/div[1]/section/div[2]/div[2]/div/div/table/tbody/tr[3]/td[2]/span/a/img"));
    public static final Target COMUNICADOS_BUTTON = Target.the("Where the user click the comunicados button")
            .located(By.xpath("//*[@id='layoutContainers']/div[1]/div[2]/div[2]/section/div[3]/div/div[2]/div/div/div/div[2]/a"));
    public static final Target NEWS_PIB_BUTTON = Target.the("Where the user click the comunicados button")
            .located(By.xpath("//*[@id='layoutContainers']/div/div[2]/section/div[2]/div[2]/div/div[1]/div[1]/div/div/div[2]/div[2]/h2/a"));

}
