package co.com.choucair.certification.proyectobase.useinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Select Choucair University")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Button for search the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Select the course")
            .located(By.xpath("//a[contains(text(),'Metodología Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extract course name")
            .located(By.xpath("//h1[contains(text(),'Metodología Bancolombia')]"));
}
