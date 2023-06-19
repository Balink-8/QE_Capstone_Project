package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginScreen extends BasePageObject{
    private By loginPage(){
        return AppiumBy.xpath("//android.view.View[@index='0']");
    }
    private By emailField(){
        return AppiumBy.xpath("//android.widget.EditText[@index='2']");
    }
    private By passwordField(){
        return AppiumBy.xpath("//android.widget.EditText[@index='4']");
    }
    private By loginButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"LOG IN\"]");
    }
    private By homePage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    private By snackbarError() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email/Password salah\"]");
    }

    @Step
    public void userOnTheLoginPage(){
        Assert.assertTrue(waitUntilVisible(loginPage()).isDisplayed());
    }
    @Step
    public void inputEmail(String email){
        onClick(emailField());
        onType(emailField(), email);
    }
    @Step
    public void inputPassword(String password){
        onClick(passwordField());
        onType(passwordField(), password);
    }
    @Step
    public void clickLoginButton(){
        onClick(loginButton());
    }
    @Step
    public void userOnTheHomePage(){
        Assert.assertTrue(waitUntilVisible(homePage()).isDisplayed());
    }
    @Step
    public boolean getErrorMessage() {
        return waitUntilVisible(snackbarError()).isDisplayed();
    }
}
