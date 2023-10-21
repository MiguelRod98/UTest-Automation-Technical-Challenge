package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterDevicesPage {

    public static final Target COMPUTER_SELECT = Target.the("Computer container field")
            .located(By.name("osId"));

    public static final Target COMPUTER = Target.the("Computer select field")
            .located(By.cssSelector("input[placeholder='Select OS']"));

    public static final Target VERSION_SELECT = Target.the("Version container field")
            .located(By.name("osVersionId"));

    public static final Target VERSION = Target.the("Version select field")
            .located(By.cssSelector("input[placeholder='Select a Version']"));

    public static final Target LANGUAGES_SELECT = Target.the("Languages container field")
            .located(By.name("osLanguageId"));

    public static final Target LANGUAGES = Target.the("Languages select field")
            .located(By.cssSelector("input[placeholder='Select OS language']"));

    public static final Target MOBILE_DEVICES_SELECT = Target.the("Mobile device container field")
            .located(By.name("handsetMakerId"));

    public static final Target MOBILE_DEVICES = Target.the("Mobile device select field")
            .located(By.cssSelector("input[placeholder='Select Brand']"));

    public static final Target MODEL_SELECT = Target.the("Model container field")
            .located(By.name("handsetModelId"));

    public static final Target MODEL = Target.the("Model select field")
            .located(By.cssSelector("input[placeholder='Select a Model']"));

    public static final Target OS_SELECT = Target.the("Operating System container field")
            .located(By.name("handsetOSId"));

    public static final Target OS = Target.the("Operating System: select field")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target LAST_STEP_BUTTON = Target.the("Last step button")
            .located(By.className("btn-blue"));

}
