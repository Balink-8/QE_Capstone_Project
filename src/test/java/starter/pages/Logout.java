package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Logout extends PageObject {

    private By iconExit(){return By.id("keluar");}
    private By ButtonYes(){return By.id("modalLogoutYesButton");}

    @Step
    public void adminClickIconExit(){
        $(iconExit()).click();
    }

    @Step
    public void adminClickButtonYes(){
        $(ButtonYes()).click();
    }

}
