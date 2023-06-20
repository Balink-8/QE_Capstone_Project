package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Home;

public class HomeSteps {

    @Steps
    Home home;
    @Given("User on Balink page")
    public void userOnBalinkPage() {
        home.onBalinkPage();
    }

    @When("User click navbar home")
    public void userClickNavbarHome() {
        home.clickNavbarHome();
    }

    @Then("user successfully enters the home page")
    public void userSuccessfullyEntersTheHomePage() {
        System.out.println("Berhasil");
    }

    @When("User click navbar download")
    public void userClickNavbarDownload() {
        home.clickNavbarDownload();
    }

    @Then("user successfully enters the download page")
    public void userSuccessfullyEntersTheDownloadPage() {
        System.out.println("success");
    }

    @When("User click navbar contactUs")
    public void userClickNavbarContactUs() {
        home.clickNavbarContactUs();
    }


    @And("User input first name in the first name field")
    public void userInputFirstNameInTheFirstNameField() {
        home.userInputFirstName("eka");
    }

    @And("User input last name in the last name field")
    public void userInputLastNameInTheLastNameField() {
        home.userInputLastName("amelia");
    }

    @And("User input email in the email field")
    public void userInputEmailInTheEmailField() {
       home.userInputEmail("eka@gmail.com");
    }

    @And("User inputs a message in the message field")
    public void userInputsAMessageInTheMessageField() {
        home.userInputMessage("halooo");
    }

    @And("User click button send")
    public void userClickButtonSend() {
        home.clickButtonSend();
    }

    @Then("user successfully sends message")
    public void userSuccessfullySendsMessage() {
        System.out.println("terkirim");
    }
}
