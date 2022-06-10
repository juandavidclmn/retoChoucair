package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.UtestOfPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestOfPage utestofpage;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestofpage));

    }
}
