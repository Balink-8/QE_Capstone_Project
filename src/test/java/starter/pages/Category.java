package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Category extends PageObject {
    private By menuCategory(){
        return By.id("kategori");
    }
    @Step
    public void clickMenuCategory(){
        $(menuCategory()).click();
    }
}
