package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginScreen;
import starter.pages.TransaksiScreen;

public class TransaksiSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    TransaksiScreen transaksiScreen;

    //=========TCTRANSAKSI01======
    @Given("user has logged in home page")
    public void userHasLoggedInHomePage() {
        loginScreen.userOnTheLoginPage();
        loginScreen.inputEmail("dinybrilianti@gmail.com");
        loginScreen.inputPassword("diny1234");
        loginScreen.clickLoginButton();
        loginScreen.clickLoginButton();
    }
    @When("user click Profile button menu")
    public void userClickProfileButtonMenu() {
        transaksiScreen.userClickProfileButtonMenu();
    }
    @And("user click Transaction button menu")
    public void userClickTransactionButtonMenu() {
        transaksiScreen.userClickTransactionButtonMenu();
    }
    @Then("user on the transaction page")
    public void userOnTheTransactionPage() {
        transaksiScreen.userOnTheTransactionPage();
    }

    //=========TCTRANSAKSI02======
    @And("user click Event button menu")
    public void userClickEventButtonMenu() {
        transaksiScreen.userClickEventButtonMenu();
    }

    @Then("user see the details list of transaction events displayed")
    public void userSeeTheDetailsListOfTransactionEventsDisplayed() {
        transaksiScreen.userSeeTheDetailsListOfTransactionEventsDisplayed();
    }

    //=========TCTRANSAKSI03======
    @And("user click on the selected event")
    public void userClickOnTheSelectedEvent() {
        transaksiScreen.userClickOnTheSelectedEvent();
    }

//        @Then("user see the details transaction events by ID")
//        public void userSeeTheDetailsTransactionEventsByID() {
//        }

    //=========TCTRANSAKSI04======
    @And("user click Shopping button menu")
    public void userClickShopingButtonMenu() {
        transaksiScreen.userClickShopingButtonMenu();
    }

    @Then("user see the details list of transaction shopping displayed")
    public void userSeeTheDetailsListOfTransactionShopingDisplayed() {
        transaksiScreen.userSeeTheDetailsListOfTransactionShopingDisplayed();
    }

    //=========TCTRANSAKSI05======

    @And("user click on the selected shopping")
    public void userClickOnTheSelectedShopping() {
        transaksiScreen.userClickOnTheSelectedShoping();
    }

    @Then("user see the detailed transaction shopping data that is displayed")
    public void adminSeeTheDetailedTransactionShoppingDataThatIsDisplayed() {
        transaksiScreen.adminSeeTheDetailedTransactionShopingDataThatIsDisplayed();
    }
}
