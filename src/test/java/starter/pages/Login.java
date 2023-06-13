package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {
//    private By EmailField(){return By.xpath("//label[text()='Email']//following-sibling::input");}
//    private By PasswordField(){return By.xpath("//label[text()='Password']//following-sibling::input");}
//    private By ButtonLogin(){return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");}
//
//    private By iconSignIn(){return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");}

    private By emailField(){return By.id("username");}
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
