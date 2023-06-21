package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import starter.pages.BasePageObject;

public class ArticleScreen extends BasePageObject {
    private By articleBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Artikel\"]");
    }
    private By articlePage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By selectArticle() {
        return AppiumBy.xpath("(//android.widget.ImageView[@index='0'])[1]");
    }
    private By detailArticle() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    //=========TCARTIKEL01======
    @Step
    public void userClickArticleButtonMenu() {
        onClick(articleBtn());
    }
    @Step
    public void usersOnTheArticlePage() {
        Assert.assertTrue(waitUntilVisible(articlePage()).isDisplayed());
    }


    //=========TCARTIKEL02======
    @Step
    public void userClickOnTheSelectedArticle() {
        onClick(selectArticle());
    }
    @Step
    public void userSeeTheDetailsArticleByID() {
        Assert.assertTrue(waitUntilVisible(detailArticle()).isDisplayed());
    }

}
