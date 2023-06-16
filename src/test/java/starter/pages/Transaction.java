package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Transaction extends PageObject {
    private By menuTransaction(){
        return By.id("transaksi");
    }
    private By eventButton(){
        return By.xpath("//p[text()='Event']");
    }
    private By detailIcon(){
        return By.id("detail-icon");
    }
    private By searchField(){
        return By.id("searchinput");
    }
    @Step
    public void clickMenuTransaction(){
        $(menuTransaction()).click();
    }
    @Step
    public void clickEventButton(){
        $(eventButton()).click();
    }
    @Step
    public void clickDetailIcon(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("detail-icon")));
        hoverOverLocationSelector.perform();
        $(detailIcon()).click();
    }
    @Step
        public void clickSearchField(String search){
            $(searchField()).type(search);
        }

}
