package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Artikel;
import starter.pages.Login;

public class ArtikelSteps {

    @Steps
    Login login;

    @Steps
    Artikel artikel;
    @Given("admin on the dashboard page")
    public void adminOnTheDashboardPage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
    }

    @When("admin clicks article menu")
    public void adminClicksArticleMenu() {
        artikel.clickMenuArtikel();
    }
    @Then("admin can see all articles")
    public void adminCanSeeAllArticles() {
        System.out.println("Admin melihat semua data artikel");
    }


    @Given("admin on article page")
    public void adminOnArticlePage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
        artikel.clickMenuArtikel();
    }

    @When("Admin clicks the detail article icon")
    public void adminClicksTheDetailArticleIcon() {
        artikel.clickArticleDetail();
    }

    @Then("Admin on the detail article page")
    public void adminOnTheDetailArticlePage() {
        System.out.println("Admin melihat detail artikel");
    }

    @When("admin click the add article button")
    public void adminClickTheAddArticleButton() {
        artikel.clickButtonAddNewArticle();
    }

    @And("admin on the add article page")
    public void adminOnTheAddArticlePage() {
        System.out.println("Admin on add new article page");
    }

    @And("admin click the add new article button to add a photos")
    public void adminClickTheAddNewArticleButtonToAddAPhotos() {
        artikel.adminInputPhoto();
    }

    @And("admin fills in the title of the article")
    public void adminFillsInTheTitleOfTheArticle() {
        artikel.adminInputTitleArticle("article12");
    }

    @And("admin fills in the article description")
    public void adminFillsInTheArticleDescription() {
        artikel.adminInputDescriptionArticle("article description");
    }

    @And("admin click the save button")
    public void adminClickTheSaveButton() {
        artikel.adminClickButtonSave();
    }

    @Then("admin managed to add new article data")
    public void adminManagedToAddNewArticleData() {
        artikel.adminManageAddNewArticle();
    }

    @When("Admin clicks icon edit article")
    public void adminClicksIconEditArticle() {
        artikel.adminClickIconEditArticle();
    }

    @And("Admin edit the title article")
    public void adminEditTheTitleArticle() {
        artikel.adminInputTitleArticle("article234");
    }

    @And("Admin edit the description article")
    public void adminEditTheDescriptionArticle() {
        artikel.adminInputDescriptionArticle("description article");
    }

    @And("Admin click save button")
    public void adminClickSaveButton() {
        artikel.adminClickSaveButton();
    }

    @When("Admin clicks the delete article icon on one of the available article data")
    public void adminClicksTheDeleteArticleIconOnOneOfTheAvailableArticleData() {
        artikel.adminClickDeleteIcon();
    }

    @And("Admin click yes button")
    public void adminClickYesButton() {
        artikel.adminClickButtonYes();
    }
}
