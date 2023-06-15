package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Transaction;

public class TransactionSteps {
    @Steps
    Login login;

    @Steps
    Transaction transaction;

    @Given("admin has logged in dashboard page")
    public void adminHasLoggedInDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
    }

    @When("admin click Transaction button menu")
    public void adminClickTransactionButtonMenu() {
        transaction.clickMenuTransaction();
    }

    @Then("admin see transaction details displayed")
    public void adminSeeTransactionDetailsDisplayed() {
        System.out.println("Anda melihat data transaksi");
    }
}
