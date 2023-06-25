package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By emailField(){return By.id("email");}
    private By passwordField(){return By.id("password");}

    private By buttonLogin(){return By.id("login-button");}


    @Step
    public void onLoginPage() {
        open();
        $(buttonLogin()).shouldBeVisible();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(buttonLogin()).click();
    }
}
