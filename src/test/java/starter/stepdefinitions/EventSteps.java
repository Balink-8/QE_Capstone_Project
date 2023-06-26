package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EventScreen;
import starter.pages.LoginScreen;

public class EventSteps {
    @Steps
    LoginScreen loginScreen;

    @Steps
    EventScreen event;

    //=========@TCEVENT01==========
    @When("user click Events button menu")
    public void userClickEventButtonMenu() {
        event.userClickEventButtonMenu();
    }
    @Then("user on the event page")
    public void userOnTheEventPage() {
        event.userOnTheEventPage();
    }
    //=========@TCEVENT02==========
    @And("user click on the selected events")
    public void userClickOnTheSelectedEvents() {
        event.userClickOnTheSelectedEvents();
    }
    @Then("user see the detailed events")
    public void userSeeTheDetailedEvents() {
        event.userSeeTheDetailedEvents();
    }
    //=========@TCEVENT03==========
    @And("user click order now button")
    public void userClickOrderNowButton() {
        event.userClickOrderNowButton();
    }
    @And("user enter the number of tickets")
    public void userEnterTheNumberOfTickets() {
        event.userEnterTheNumberOfTickets();
    }
    @And("user click buy now button")
    public void userClickBuyNowButton() {
        event.userClickBuyNowButton();
    }
    @And("user to checkout page")
    public void userToCheckoutPage() {
        event.userToCheckoutPage();
    }
    @And("user click payment method")
    public void userClickPaymentMethod() {
        event.userClickPaymentMethod();
    }
    @And("user choose a payment method")
    public void userChooseAPaymentMethod() {
        event.userChooseAPaymentMethod();
    }
    @And("user click next button")
    public void userClickNextButton() {
        event.userClickNextButton();
    }
    @And("user click make an order button")
    public void userClickMakeAnOrderButton() {
        event.userClickMakeAnOrderButton();
    }
    @And("user on the payment code page")
    public void userOnThePaymentCodePage() {
        event.userOnThePaymentCodePage();
    }
    @And("user click upload proof of payment button")
    public void userClickUploadProofOfPaymentButton() {
        event.userClickUploadProofOfPaymentButton();
    }
    @Then("user successfully performs a checkout event")
    public void userSuccessfullyPerformsACheckoutEvent() {
        event.userSuccessfullyPerformsACheckoutEvent();
    }

}
