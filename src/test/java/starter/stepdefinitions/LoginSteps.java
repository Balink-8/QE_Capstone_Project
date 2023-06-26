package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Given("User on login screen")
    public void userOnLoginScreen() {
        loginScreen.userOnTheLoginPage();
    }

    @When("user input {string} on email field")
    public void userInputOnEmailField(String email) {
        loginScreen.inputEmail(email);
    }

    @When("user input {string} on password field")
    public void userInputOnPasswordField(String password) {
        loginScreen.inputPassword(password);
    }

    @And("User click Login button")
    public void userClickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("User on home screen")
    public void userOnHomeScreen() {
        loginScreen.userOnTheHomePage();
    }

    @When("User input invalid email {string} on email field")
    public void userInputInvalidEmailOnEmailField(String email) {
        loginScreen.inputEmail(email);
    }

    @And("User input valid password{string} on password field")
    public void userInputValidPasswordOnPasswordField(String password) {
        loginScreen.inputPassword(password);
    }

    @Then("User see the error message")
    public void userSeeTheErrorMessage() {
        Assert.assertTrue(loginScreen.getErrorMessage());
    }

    @And("User input invalid password{string} on password field")
    public void userInputInvalidPasswordOnPasswordField(String password) {
        loginScreen.inputPassword(password);
    }
}
