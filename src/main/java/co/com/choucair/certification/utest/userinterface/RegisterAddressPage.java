package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterAddressPage {

    public static final Target CITY_INPUT = Target.the("City field")
            .located(By.id("city"));

    public static final Target ZIP_INPUT = Target.the("Zip field")
            .located(By.id("zip"));

    public static final Target COUNTRY_SELECT = Target.the("Country container field")
            .located(By.name("countryId"));

    public static final Target COUNTRY = Target.the("Country select field")
            .located(By.cssSelector("input[placeholder='Select a country']"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("Next devices button")
            .located(By.className("btn-blue"));
}
