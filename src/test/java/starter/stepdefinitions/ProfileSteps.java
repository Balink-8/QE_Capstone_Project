package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProfileScreen;

public class ProfileSteps {
    @Steps
    ProfileScreen profile;
    @And("user click edit button")
    public void userClickEditButton() {
        profile.userClickEditButton();
    }

    @And("user input {string} on email field in edit")
    public void userInputOnEmailFieldInEdit(String arg0) {
        profile.userInputOnEmailFieldInEdit("dinybriliant@gmail.com");
    }

    @And("user input {string} on telephone number field")
    public void userInputOnTelephoneNumberField(String arg0) {
        profile.userInputOnTelephoneNumberField("085156505511");
    }

    @And("user input {string} on address field")
    public void userInputOnAddressField(String arg0) {
        profile.userInputOnAddressField("Nganjuk");
    }

    @And("user click save button")
    public void userClickSaveButton() {
        profile.userClickSaveButton();
    }

//    @Then("user successfully edit profile")
//    public void userSuccessfullyEditProfile() {
//    }
}
