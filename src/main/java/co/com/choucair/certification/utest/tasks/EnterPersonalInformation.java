package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.RegisterPersonalPage.*;

public class EnterPersonalInformation implements Task {

    private List<User> user;

    public EnterPersonalInformation(List<User> user) {
        this.user = user;
    }

    public static EnterPersonalInformation enterPersonalInfo(List<User> user) {
        return Tasks.instrumented(EnterPersonalInformation.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get(0).getFirstName()).into(FIRST_NAME_INPUT),
                Enter.theValue(user.get(0).getLastName()).into(LAST_NAME_INPUT),
                Enter.theValue(user.get(0).getEmail()).into(EMAIL_ADDRESS_INPUT),
                SelectFromOptions.byVisibleText(user.get(0).getBirthMonth()).from(MONTH_BIRTH_SELECT),
                SelectFromOptions.byVisibleText(user.get(0).getBirthDay()).from(DAY_BIRTH_SELECT),
                SelectFromOptions.byVisibleText(user.get(0).getBirthYear()).from(YEAR_BIRTH_SELECT),
                Click.on(NEXT_LOCATION_BUTTON)
        );
    }
}
