package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Akun extends PageObject {

    private By accountMenu(){return By.id("akun");}

    private By iconDetail(){return By.id("detail-icon");}
    @Step
    public void clickMenuAccount(){
        $(accountMenu()).click();
    }

    @Step
    public void clickDetailAccount(){

        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("detail-icon")));
        hoverOverLocationSelector.perform();
        $(iconDetail()).click();
    }
}
