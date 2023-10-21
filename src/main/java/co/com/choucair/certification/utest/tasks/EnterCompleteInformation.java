package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.RegisterCompletePage.*;

public class EnterCompleteInformation implements Task {

    private List<User> user;

    public EnterCompleteInformation(List<User> user) {
        this.user = user;
    }

    public static EnterCompleteInformation enterCompleteInfo(List<User> user) {
        return Tasks.instrumented(EnterCompleteInformation.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get(0).getPassword()).into(PASSWORD),
                Enter.theValue(user.get(0).getConfirmPassword()).into(CONFIRM_PASSWORD),
                Click.on(OPTIONAL_CHECKBOX),
                Click.on(TERM_AND_GUIDELINES_CHECKBOX),
                Click.on(PRIVACY_CHECKBOX),
                Click.on(COMPLETE_SETUP_BUTTON)
        );
    }
}
