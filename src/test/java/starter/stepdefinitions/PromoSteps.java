package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Promo;

public class PromoSteps {

    @Steps
    Login login;

    @Steps
    Promo promo;
    @Given("admin on dashboard page")
    public void adminOnDashboardPage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
    }

    @When("admin click promo menu")
    public void adminClickPromoMenu() {
        promo.clickMenuPromo();
    }

    @Then("admin can see all promo data")
    public void adminCanSeeAllPromoData() {
        System.out.println("Admin melihat data promo");
    }

    @Given("admin on promo page")
    public void adminOnPromoPage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
        promo.clickMenuPromo();
    }

    @When("Admin clicks the add promo button")
    public void adminClicksTheAddPromoButton() {
        promo.clickAddPromo();
    }

    @And("Admin on the add promo page")
    public void adminOnTheAddPromoPage() {
        System.out.println("Admin on add promo page");
    }

    @And("Admin input the promo name in the promo name field")
    public void adminInputThePromoNameInThePromoNameField() {
        promo.inputNamePromo("Juni");
    }

    @And("Admin input the promo description in the promo description field")
    public void adminInputThePromoDescriptionInThePromoDescriptionField() {
        promo.inputDeskripsiPromo("Promo Bulan Juni");
    }

    @And("Admin input the promo code in the promo code field")
    public void adminInputThePromoCodeInThePromoCodeField() {
        promo.inputKodePromo("juli1245");
    }

    @And("Admin input the discount in the discount field")
    public void adminInputTheDiscountInTheDiscountField() {
        promo.inputPotonganHarga("60.000");
    }

    @And("Admin clicks the save button")
    public void adminClicksTheSaveButton() {
        promo.clickButtonSimpan();
    }

    @Then("the Admin gets a notification {string}")
    public void theAdminGetsANotification(String arg0) {
        System.out.println("Admin berhasil menambahkan data promo");
    }

    @When("Admin clicks the detail promo icon on one of the available promo data")
    public void adminClicksTheDetailPromoIconOnOneOfTheAvailablePromoData() {
        promo.clickDetailIcon();
    }

    @Then("Admin on the detail promo page")
    public void adminOnTheDetailPromoPage() {
        System.out.println("Admin on promo page");
    }

    @When("Admin clicks icon edit promo")
    public void adminClicksIconEditPromo() {
        promo.clickIconEdit();
    }

    @And("Admin edit the promo name in the promo name field")
    public void adminEditThePromoNameInThePromoNameField() {
        promo.inputEditNamePromo("Juni Berkah");
    }

    @And("Admin edit the promo code in the promo code field")
    public void adminEditThePromoCodeInThePromoCodeField() {
        promo.inputEditCodePromo("juni17");
    }

    @When("Admin clicks the delete promo icon on one of the available promo data")
    public void adminClicksTheDeletePromoIconOnOneOfTheAvailablePromoData() {
        promo.clickDeleteIcon();
    }

    @And("Admin gets a notification {string}")
    public void adminGetsANotification(String arg0) {
        System.out.println("apakah anda yakin ingin menghapus data?");
    }

    @And("Admin click the yes button")
    public void adminClickTheYesButton() {
        promo.clickButtonYes();
    }
}
