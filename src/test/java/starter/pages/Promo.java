package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Promo extends PageObject {

    private By menuPromo(){return By.id("promo");}

    @Step
    public void clickMenuPromo(){
        $(menuPromo()).click();
    }
}
