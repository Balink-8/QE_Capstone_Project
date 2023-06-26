package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.CheckoutScreen;

public class CheckoutSteps {
    @Steps
    CheckoutScreen checkoutScreen;
    @And("user click cloth endek product button menu")
    public void userClickClothEndekProductButtonMenu() {
        checkoutScreen.clickProductButton();
    }

    @And("user see at the page detail cloth endek product category is displayed")
    public void userSeeAtThePageDetailClothEndekProductCategoryIsDisplayed() {
        checkoutScreen.userOnTheProductPageScreen();
    }

    @And("user click beli sekarang button menu")
    public void userClickBeliSekarangButtonMenu() {
        checkoutScreen.clikBuyButton();
    }

    @And("user click beli sekarang button menu again")
    public void userClickBeliSekarangButtonMenuAgain() {
        checkoutScreen.clickBuyButton2();
    }

    @And("user see at the checkout page")
    public void userSeeAtTheCheckoutPage() {
        checkoutScreen.userOnTheCheckoutPage();
    }

    @And("user select payment method transfer bank central asia")
    public void userSelectPaymentMethodTransferBankCentralAsia() {
        checkoutScreen.userClickBCAPaymentMethod();
    }

    @Then("user see at the payment code page")
    public void userSeeAtThePaymentCodePage() {
        checkoutScreen.userOnThePaymentCodePage();
    }

    @And("user select payment method transfer bank mandiri")
    public void userSelectPaymentMethodTransferBankMandiri() {
        checkoutScreen.userClickMandiriPaymentMethod();
    }
}
