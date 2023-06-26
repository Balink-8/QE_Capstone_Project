package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.SettingScreen;

public class SettingSteps {

    @Steps
    SettingScreen setting;

    //=========TCSETTING01======
    @And("user click Setting button menu")
    public void userClickSettingButtonMenu() {
        setting.userClickSettingButtonMenu();
    }
    @And("user click Privacy Policy menu")
    public void userClickPrivacyPolicyMenu() {
        setting.userClickPrivacyPolicyMenu();
    }
    @Then("user will see the privacy policy page")
    public void userWillSeeThePrivacyPolicyPage() {
        setting.userWillSeeThePrivacyPolicyPage();
    }

    //=========TCSETTING02======
    @And("user click About Us menu")
    public void userClickAboutUsMenu() {
        setting.userClickAboutUsMenu();
    }

    @And("user click Term of Service menu")
    public void userClickTermOfServiceMenu() {
        setting.userClickTermOfServiceMenu();
    }

    @Then("user will see the term of service page")
    public void userWillSeeTheTermOfServicePage() {
        setting.userWillSeeTheTermOfServicePage();
    }

    //=========TCSETTING03======
    @And("user click Copyright Policy menu")
    public void userClickCopyrightPolicyMenu() {
    }

    @Then("user will see the copyright policy page")
    public void userWillSeeTheCopyrightPolicyPage() {
    }
}
