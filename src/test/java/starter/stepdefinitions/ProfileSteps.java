package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Profile;

public class ProfileSteps {
    @Steps
    Login login;

    @Steps
    Profile profile;

    @Given("admin has logged in Dashboard page")
    public void adminHasLoggedinDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
    }

    @When("admin click Profile button menu")
    public void adminClickButtonMenu() {
        profile.clickMenuProfile();
    }

    @Then("admin see profile details displayed")
    public void adminSeeProfileDetailsDisplayed() {
        System.out.println("Anda melihat data profil");
    }

    @And("admin click Edit Profile button")
    public void adminClickEditProfileButton() {
        profile.clickMenuEditProfile();
    }

    @And("admin input email valid on the email field")
    public void adminInputEmailValidOnTheEmailField() {
        profile.inputEmail("BalinkBarong@gmail.com");
    }

    @And("admin input phone number valid on the phone number field")
    public void adminInputPhoneNumberValidOnThePhoneNumberField() {
        profile.inputPhoneNumber("+62 812 3456 7891");
    }

    @And("admin input whatsapp number valid on the whatsapp number field")
    public void adminInputWhatsappNumberValidOnTheWhatsappNumberField() {
        profile.inputWhatsappNumber("+62 812 3456 7891");
    }

    @And("admin input instagram username valid on the instagram username field")
    public void adminInputInstagramUsernameValidOnTheInstagramUsernameField() {
        profile.inputInstagramUsername("@balinkbarong");
    }

    @And("admin input facebook username valid on the facebook username field")
    public void adminInputFacebookUsernameValidOnTheFacebookUsernameField() {
        profile.inputFacebookUsername("Pesonabalibarong");
    }

    @And("admin click Simpan button")
    public void adminClickSimpanButton() {
        profile.clickSimpanButton();
    }

    @Then("admin see notification Berhasil Disimpan displayed")
    public void adminSeeNotificationBerhasilDisimpanDisplayed() {
        System.out.println("Data Berhasil disimpan");
    }

    @And("admin input country valid on the country field")
    public void adminInputCountryValidOnTheCountryField() {
        profile.inputNegaraField("Indonesia");
    }

    @And("admin input zip code valid on the zip code field")
    public void adminInputZipCodeValidOnTheZipCodeField() {
        profile.inputKodePos("16442");
    }

    @And("admin input address valid on the address field")
    public void adminInputAddressValidOnTheAddressField() {
        profile.inputAlamat("Kecamatan Kuta, Sebelah Selata Kota Denpasar, Bali");
    }

    @And("admin input bank account number valid on the Bank account number field")
    public void adminInputBankAccountNumberValidOnTheBankAccountNumberField() {
        profile.inputBankAccount("3456 1234 6789");
    }
}