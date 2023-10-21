package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UTestHomePage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("User registration button")
            .located(By.linkText("Join Today"));
}
