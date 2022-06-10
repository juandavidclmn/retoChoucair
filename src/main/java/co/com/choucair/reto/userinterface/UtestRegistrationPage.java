package co.com.choucair.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegistrationPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Select button join today").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("Enter first name").
            located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Enter last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Enter email address").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select month of birth").
            located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']//*[contains (text(),'December')]"));
    public static final Target SELECT_DAY = Target.the("Select day of birth").
            located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']//*[contains (text(),'2')]"));
    public static final Target SELECT_YEAR = Target.the("Select year of birth").
            located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']//*[contains (text(),'1996')]"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Select button next location").
            located(By.xpath("//div[@class='form-group col-xs-12 text-right']//*[contains(text(), 'Next: Location')]"));
    public static final Target SELECT_CITY = Target.the("Select city of residence").
            located(By.id("city"));
    public static final Target NEXT_DEVICE_BUTTON = Target.the("Select button next device ").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target DEPLOY_DEVICES = Target.the("Deploy devices").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_DEVICE = Target.the("Select device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[90]/span/div"));
    public static final Target DEPLOY_MODELS = Target.the("Deploy models").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_MODEL = Target.the("Select model").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[131]/span/div"));
    public static final Target DEPLOY_OPERATING_SYSTEMS = Target.the("Deploy operating systems").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Select operating system").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[4]/span/div"));
    public static final Target NEXT_STEP_BUTTON = Target.the("Select button next step").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password").
            located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password").
            located(By.id("confirmPassword"));
    public static final Target OPTIONAL_CHECK = Target.the("Click on optional check").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS_OF_USE_CHECK = Target.the("Click on terms of use check").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target POLICIES_CHECK = Target.the("Click on policies check").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_CONFIGURATION_BUTTON = Target.the("Select button complete configuration").
            located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("Extract the welcome message ").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));

}
