package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Logout;

public class LogoutSteps {

    @Steps
    Login login;

    @Steps
    Logout logout;
    @Given("admin on dashboard pages")
    public void adminOnDashboardPages() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
    }

    @When("admin click icon exit")
    public void adminClickIconExit() {
        logout.adminClickIconExit();
    }

    @And("admin click button confirm yes")
    public void adminClickButtonConfirmYes() {
        logout.adminClickButtonYes();
    }
}
