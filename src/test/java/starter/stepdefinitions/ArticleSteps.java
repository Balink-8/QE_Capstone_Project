package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.ArticleScreen;

public class ArticleSteps {

    @Steps
    ArticleScreen article;
    //=========TCARTIKEL01======
    @And("user click Article button menu")
    public void userClickArticleButtonMenu() {
        article.userClickArticleButtonMenu();
    }
    @Then("users on the article page")
    public void usersOnTheArticlePage() {
        article.usersOnTheArticlePage();
    }

    //=========TCARTIKEL01======
    @And("user click on the selected article")
    public void userClickOnTheSelectedArticle() {
        article.userClickOnTheSelectedArticle();
    }

    @Then("user see the details article by ID")
    public void userSeeTheDetailsArticleByID() {
        article.userSeeTheDetailsArticleByID();
    }
}
