package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Akun extends PageObject {

    private By accountMenu(){return By.id("akun");}


    @Step
    public void clickMenuAccount(){
        $(accountMenu()).click();
    }
}
