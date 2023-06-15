package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Profile extends PageObject {
    private By menuProfile(){
        return By.id("profile");
    }
    @Step
    public void clickMenuProfile(){
        $(menuProfile()).click();
    }
}
