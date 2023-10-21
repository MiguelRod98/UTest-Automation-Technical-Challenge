package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.RegisterDevicesPage.*;
import static org.openqa.selenium.Keys.*;

public class EnterDevicesInformation implements Task {

    private List<User> user;

    public EnterDevicesInformation(List<User> user) {
        this.user = user;
    }

    public static EnterDevicesInformation enterDeviceInfo(List<User> user) {
        return Tasks.instrumented(EnterDevicesInformation.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_SELECT),
                Enter.theValue(user.get(0).getComputer()).into(COMPUTER).thenHit(ARROW_DOWN, ENTER),
                Click.on(VERSION_SELECT),
                Enter.theValue(user.get(0).getVersion()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(LANGUAGES_SELECT),
                Enter.theValue(user.get(0).getLanguages()).into(LANGUAGES).thenHit(ARROW_DOWN, ENTER),
                Click.on(MOBILE_DEVICES_SELECT),
                Enter.theValue(user.get(0).getMobileDevice()).into(MOBILE_DEVICES).thenHit(ARROW_DOWN, ENTER),
                Click.on(MODEL_SELECT),
                Enter.theValue(user.get(0).getModel()).into(MODEL).thenHit(ARROW_DOWN, ENTER),
                Click.on(OS_SELECT),
                Enter.theValue(user.get(0).getOperatingSystem()).into(OS).thenHit(ARROW_DOWN, ENTER),
                Click.on(LAST_STEP_BUTTON)
        );
    }
}
