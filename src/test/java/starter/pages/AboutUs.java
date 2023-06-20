package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

public class AboutUs extends PageObject {

    private By navbarAboutus(){return By.xpath("//a[text()='Tentang Kami']");}




//    private By aboutUsPage(){return By.id("info");}

    @Step
    public void onBalinkPage(){
        open();
        $(navbarAboutus()).shouldBeVisible();
    }

    @Step
    public void clickNavbarAboutUs(){
        $(navbarAboutus()).click();
    }


}
