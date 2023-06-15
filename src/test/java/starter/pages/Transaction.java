package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Transaction extends PageObject {
    private By menuTransaction(){
        return By.id("transaksi");
    }
    @Step
    public void clickMenuTransaction(){
        $(menuTransaction()).click();
    }
}
