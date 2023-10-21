package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.RegisterCompletePage.*;


public class AnswerConfirmRegister implements Question<Boolean> {

    private List<User> user;

    public AnswerConfirmRegister(List<User> user) {
        this.user = user;
    }

    public static AnswerConfirmRegister toThe(List<User> user) {
        return new AnswerConfirmRegister(user);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String testConfirmationButton = Text.of(COMPLETE_SETUP_BUTTON).viewedBy(actor).asString();
        return user.get(0).getConfirmationRegisterText().equals(testConfirmationButton);
    }
}
