package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterScreen extends BasePageObject{
    private By loginPage(){
        return AppiumBy.xpath("//android.view.View[@index='0']");
    }
    private By registerLinkButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Registrasi\"]");
    }
    private By registerPage(){
        return AppiumBy.xpath("//android.view.View[@index='0']");
    }
    private By emailField(){
        return AppiumBy.xpath("//android.widget.EditText[@index='4']");
    }
    private By telephoneNumberField(){
        return AppiumBy.xpath("//android.widget.EditText[@index='6']");
    }
    private By passwordField(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Password\"]/following-sibling::android.widget.EditText");
    }
    private By confirmPasswordField(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Confirm Password\"]/following-sibling::android.widget.EditText");
    }
    private By registerButton(){
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"REGISTER\"])[2]\n");
    }

    @Step
    public void UserOnTheLoginPage(){
        Assert.assertTrue(waitUntilVisible(loginPage()).isDisplayed());
    }
    @Step
    public void userClickRegisterLinkButton(){
        onClick(registerLinkButton());
    }
    @Step
    public void userOnTheRegisterPage(){
        Assert.assertTrue(waitUntilVisible(registerPage()).isDisplayed());
    }
    @Step
    public void inputEmailField(String email){
        onClick(emailField());
        onType(emailField(), email);
    }
    @Step
    public void inputTelephoneNumberField(String numberTelephone){
        onClick(telephoneNumberField());
        onType(telephoneNumberField(), numberTelephone);
    }
    @Step
    public void inputPasswordField(String password){
        onClick(passwordField());
        onType(passwordField(), password);
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void inputConfirmPasswordField(String confirmPassword){
        onClick(confirmPasswordField());
        onType(confirmPasswordField(), confirmPassword);
        driver.getAndroidDriver().hideKeyboard();
    }
    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }
}