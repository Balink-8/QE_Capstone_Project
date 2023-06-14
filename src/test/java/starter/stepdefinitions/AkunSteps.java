package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Akun;
import starter.pages.Login;

public class AkunSteps {

    @Steps
    Login login;

    @Steps
    Akun akun;
    @Given("Admin on detail dashboard page")
    public void adminOnDetailDashboardPage() {

        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
    }

    @When("Admin click account menu")
    public void adminClickAccountMenu() {
        akun.clickMenuAccount();
    }

    @Then("Admin can view all account data")
    public void adminCanViewAllAccountData() {
        System.out.println("Admin melihat semua data akun");
    }

    @And("Admin on account page")
    public void adminOnAccountPage() {
        System.out.println("Admin on account page");
    }

    @And("Admin clicks the account details icon")
    public void adminClicksTheAccountDetailsIcon() {
        akun.clickDetailAccount();
    }

    @Then("Admin successfully view user account details")
    public void adminSuccessfullyViewUserAccountDetails() {
        System.out.println("Admin melihat detail akun");
    }
}
