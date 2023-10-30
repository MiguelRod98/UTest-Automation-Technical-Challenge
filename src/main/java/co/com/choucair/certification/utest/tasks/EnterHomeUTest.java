package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UTestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.certification.utest.userinterface.UTestHomePage.*;

public class EnterHomeUTest implements Task {

    private UTestHomePage uTestHomePage;

    public static EnterHomeUTest openPage() {
        return Tasks.instrumented(EnterHomeUTest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestHomePage), Click.on(JOIN_TODAY_BUTTON));
    }
}
