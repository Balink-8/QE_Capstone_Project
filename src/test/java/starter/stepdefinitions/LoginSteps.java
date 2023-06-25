package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginSteps {

    @Steps
    Login login;
    @Given("Admin on login page")
    public void adminOnLoginPage() {
        login.onLoginPage();
    }

    @When("Admin input valid username in the username field")
    public void adminInputValidUsernameInTheUsernameField() {
        login.inputEmail("BalinkBarong@gmail.com");
    }

    @And("Admin input a valid password in the password field")
    public void adminInputAValidPasswordInThePasswordField() {
        login.inputPassword("123456");
    }

    @And("Admin click Login button")
    public void adminClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("Admin on dashboard page")
    public void adminOnDashboardPage() {
        System.out.println("Admin succes login");
    }

    @When("Admin input invalid username")
    public void adminInputInvalidUsername() {
        login.inputEmail("Barong");
    }

    @And("Admin input valid password")
    public void adminInputValidPassword() {
        login.inputPassword("123456");
    }

    @Then("Admin see error message {string}")
    public void adminSeeErrorMessage(String arg0) {
        System.out.println("Wrong Email or Password");
    }

    public void onLoginSteps() {
    }

    public void inputPassword(String number) {
    }

    public void inputEmail(String mail) {
    }

    public void clickLoginButton() {
    }
}
