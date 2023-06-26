package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutScreen;

public class LogoutSteps {
    @Steps
    LogoutScreen logoutScreen;
    @When("user click profile button menu")
    public void userClickProfileButtonMenu() {
        logoutScreen.userClickProfileButtonMenu();
    }

    @And("user click settings button menu")
    public void userClickSettingsButtonMenu() {
        logoutScreen.userClickSettingsButtonMenu();
    }

    @And("user click logout button menu")
    public void userClickLogoutButtonMenu() {
        logoutScreen.userClickLogoutButton();
    }

    @And("user click logout button menu2")
    public void userClickKeluarButtonMenu2() {
        logoutScreen.userClickLogOutButton2();
    }
    @Then("user success log out from the application")
    public void userSuccessLogOutFromTheApplication() {
        System.out.println("Anda berhasil keluar dari aplikasi");
    }


}
