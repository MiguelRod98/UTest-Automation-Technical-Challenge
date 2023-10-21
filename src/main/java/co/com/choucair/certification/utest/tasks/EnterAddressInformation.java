package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.RegisterAddressPage.*;

public class EnterAddressInformation implements Task {

    private List<User> user;

    public EnterAddressInformation(List<User> user) {
        this.user = user;
    }

    public static EnterAddressInformation enterAddressInfo(List<User> user) {
        return Tasks.instrumented(EnterAddressInformation.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get(0).getCity()).into(CITY_INPUT),
                Hit.the(Keys.ARROW_DOWN).into(CITY_INPUT),
                Hit.the(Keys.ENTER).into(CITY_INPUT),
                Enter.theValue(user.get(0).getZip()).into(ZIP_INPUT),
                Click.on(COUNTRY_SELECT),
                Enter.theValue(user.get(0).getCountry()).into(COUNTRY),
                Click.on(NEXT_DEVICES_BUTTON)
                );
    }
}
