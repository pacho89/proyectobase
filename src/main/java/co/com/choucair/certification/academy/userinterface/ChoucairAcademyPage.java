package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject{
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where do we wirte the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we wirte the password").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
