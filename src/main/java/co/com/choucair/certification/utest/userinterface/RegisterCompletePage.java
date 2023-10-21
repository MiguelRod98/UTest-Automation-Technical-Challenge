package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterCompletePage {

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field")
            .located(By.id("confirmPassword"));

    public static final Target OPTIONAL_CHECKBOX = Target.the("Optional checkbox field")
            .located(By.cssSelector(".checkmark.signup-consent__checkbox.signup-consent__checkbox--highlight"));

    public static final Target TERM_AND_GUIDELINES_CHECKBOX = Target.the("Term and Guidelines field")
            .located(By.cssSelector(".checkmark.signup-consent__checkbox.error"));

    public static final Target PRIVACY_CHECKBOX = Target.the("Privacy & Security Policy field")
            .located(By.cssSelector(".checkmark.signup-consent__checkbox.error"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Complete setup button")
            .located(By.id("laddaBtn"));
}
