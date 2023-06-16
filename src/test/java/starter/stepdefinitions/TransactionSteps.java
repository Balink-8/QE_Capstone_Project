package starter.stepdefinitions;

import io.cucumber.java.en.And;
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

    @Then("admin see transaction product list displayed")
    public void adminSeeTransactionProductListDisplayed() {
        System.out.println("Anda melihat data transaksi produk");
    }

    @And("admin click Event button menu")
    public void adminClickEventButtonMenu() {
        transaction.clickEventButton();
    }

    @Then("admin see the details list of transaction events displayed")
    public void adminSeeTheDetailsListOfTransactionEventsDisplayed() {
        System.out.println("Anda Melihat data transaksi event");
    }

    @And("admin click detail icon button menu")
    public void adminClickDetailIconButtonMenu() {
        transaction.clickDetailIcon();
    }

    @Then("admin see the detail transaction of product displayed")
    public void adminSeeTheDetailTransactionOfProductDisplayed() {
        System.out.println("Anda melihat detail data transaksi produk");
    }

    @And("admin click Search button to input valid transaction code search event by transaction code")
    public void adminClickSearchButtonToInputValidTransactionCodeSearchEventByTransactionCode() {
        transaction.clickSearchField("ABCD1234E5F6");
    }
    @Then("admin see the detailed transaction data and transaction status event that is displayed")
    public void adminSeeTheDetailedTransactionDataAndTransactionStatusEventThatIsDisplayed() {
        System.out.println("Data berdasarkan kode transaksi berhasil di tampilkan");
    }

    @And("admin click Search button to input invalid transaction code search event by transaction code")
    public void adminClickSearchButtonToInputInvalidTransactionCodeSearchEventByTransactionCode() {
        transaction.clickSearchField("qwertyuipio9");
    }
}
