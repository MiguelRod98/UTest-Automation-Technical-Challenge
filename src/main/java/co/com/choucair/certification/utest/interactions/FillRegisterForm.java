package co.com.choucair.certification.utest.interactions;

import co.com.choucair.certification.utest.model.User;
import co.com.choucair.certification.utest.tasks.EnterAddressInformation;
import co.com.choucair.certification.utest.tasks.EnterCompleteInformation;
import co.com.choucair.certification.utest.tasks.EnterDevicesInformation;
import co.com.choucair.certification.utest.tasks.EnterPersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillRegisterForm implements Interaction {

    private List<User> user;

    public FillRegisterForm(List<User> user) {
        this.user = user;
    }

    public static FillRegisterForm withUser(List<User> user) {
        return instrumented(FillRegisterForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterPersonalInformation.enterPersonalInfo(user),
                EnterAddressInformation.enterAddressInfo(user),
                EnterDevicesInformation.enterDeviceInfo(user),
                EnterCompleteInformation.enterCompleteInfo(user)
        );
    }
}
