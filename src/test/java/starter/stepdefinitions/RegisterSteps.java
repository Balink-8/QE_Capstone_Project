package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen registerScreen;
    @Given("User on log in page")
    public void userOnLogInPage() {
        registerScreen.UserOnTheLoginPage();
    }

    @When("User click register link button menu")
    public void userClickRegisterLinkButtonMenu() {
        registerScreen.userClickRegisterLinkButton();
    }

    @And("User on register page")
    public void userOnRegisterPage() {
        registerScreen.userOnTheRegisterPage();
    }

    @And("User input a valid email in the email field")
    public void userInputAValidEmailInTheEmailField() {
        registerScreen.inputEmailField("dinybriliant@gmail.com");
    }

    @And("User input a valid number phone in the number phone field")
    public void userInputAValidNumberPhoneInTheNumberPhoneField() {
        registerScreen.inputTelephoneNumberField("085156505511");
    }

    @And("User input a valid password in the password field")
    public void userInputAValidPasswordInThePasswordField(){
        registerScreen.inputPasswordField("diny1234");
    }

    @And("User input a valid confirm password in the confirm password field")
    public void userInputAValidConfirmPasswordInTheConfirmPasswordField() {
        registerScreen.inputConfirmPasswordField("diny1234");
    }

    @And("User click register button")
    public void userClickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("User on login page")
    public void userOnLoginPage() {
        registerScreen.UserOnTheLoginPage();
    }
}
