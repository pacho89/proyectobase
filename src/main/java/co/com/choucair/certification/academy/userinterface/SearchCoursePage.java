package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends  PageObject{

    public static final Target BUTTON_UC = Target.the("Selecciona Universidad Choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click en el curso")
            .located(By.xpath("//h4[contains(text), 'Recursos Automatización Bancolombia'"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text), 'Recursos Automatización Bancolombia'"));
}
