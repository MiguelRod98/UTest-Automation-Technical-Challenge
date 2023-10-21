package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPersonalPage {

    public static final Target FIRST_NAME_INPUT = Target.the("First name field")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_INPUT = Target.the("Last name field")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS_INPUT = Target.the("Email address field")
            .located(By.id("email"));

    public static final Target MONTH_BIRTH_SELECT = Target.the("Month birth field")
            .located(By.id("birthMonth"));

    public static final Target DAY_BIRTH_SELECT = Target.the("Day birth field")
            .located(By.id("birthDay"));

    public static final Target YEAR_BIRTH_SELECT = Target.the("Year birth field")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Next location button")
            .located(By.className("btn-blue"));
}
