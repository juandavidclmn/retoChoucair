package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.UtestRegistrationPage;
import com.sun.xml.bind.v2.runtime.output.UTF8XmlOutput;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UtestRegistration implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strPassword;
    private String strConfirmPassword;

    public UtestRegistration(String strName, String strLastName, String strEmail, String strCity, String strPassword, String strConfirmPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static UtestRegistration theInformation(String strName, String strLastName, String strEmail,
                                                   String strCity, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(UtestRegistration.class, strName, strLastName, strEmail, strCity, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistrationPage.JOIN_BUTTON),
                Enter.theValue(strName).into(UtestRegistrationPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegistrationPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegistrationPage.INPUT_EMAIL),
                Click.on(UtestRegistrationPage.SELECT_MONTH),
                Click.on(UtestRegistrationPage.SELECT_DAY),
                Click.on(UtestRegistrationPage.SELECT_YEAR),
                Click.on(UtestRegistrationPage.NEXT_LOCATION_BUTTON),
                Enter.theValue(strCity).into(UtestRegistrationPage.SELECT_CITY),
                Click.on(UtestRegistrationPage.NEXT_DEVICE_BUTTON),
                Click.on(UtestRegistrationPage.DEPLOY_DEVICES),
                Click.on(UtestRegistrationPage.SELECT_DEVICE),
                Click.on(UtestRegistrationPage.DEPLOY_MODELS),
                Click.on(UtestRegistrationPage.SELECT_MODEL),
                Click.on(UtestRegistrationPage.DEPLOY_OPERATING_SYSTEMS),
                Click.on(UtestRegistrationPage.SELECT_OPERATING_SYSTEM),
                Click.on(UtestRegistrationPage.NEXT_STEP_BUTTON),
                Enter.theValue(strPassword).into(UtestRegistrationPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestRegistrationPage.CONFIRM_PASSWORD),
               // Click.on(UtestRegistrationPage.OPTIONAL_CHECK),
                Click.on(UtestRegistrationPage.TERMS_OF_USE_CHECK),
                Click.on(UtestRegistrationPage.POLICIES_CHECK),
                Click.on(UtestRegistrationPage.COMPLETE_CONFIGURATION_BUTTON)
        );

    }
}
