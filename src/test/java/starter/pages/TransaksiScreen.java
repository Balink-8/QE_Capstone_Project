package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TransaksiScreen extends BasePageObject {

    private By accountBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@index='3']");
    }

    private By transactionBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Transaksi\"]");
    }

    private By transactionPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View");
    }

    private By eventTransaksiBtn() {
        return AppiumBy.xpath("//android.view.View[@index='1']");
    }

    private By eventTransaksiPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View");
    }

    private By eventDetail() {
        return AppiumBy.xpath("//android.widget.ImageView[@index='0']");
    }

    private By shoppingTransaksiBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@index=\"2\"]");
    }
    private By shoppingTransaksiPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By shoppingDetail() {
        return AppiumBy.xpath("//android.widget.ImageView[@index='0']");
    }
    private By shoppingDetailPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
    }


    //=========TCTRANSAKSI01======

    @Step
    public void userClickProfileButtonMenu() {
        onClick(accountBtn());
    }

    @Step
    public void userClickTransactionButtonMenu() {
        onClick(transactionBtn());
    }

    @Step
    public void userOnTheTransactionPage() {
        Assert.assertTrue(waitUntilVisible(transactionPage()).isDisplayed());
    }

    //=========TCTRANSAKSI02======
    @Step
    public void userClickEventButtonMenu() {
        onClick(eventTransaksiBtn());
    }
    @Step
    public void userSeeTheDetailsListOfTransactionEventsDisplayed() {
        Assert.assertTrue(waitUntilVisible(eventTransaksiPage()).isDisplayed());
    }

    //=========TCTRANSAKSI03======
    @Step
    public void userClickOnTheSelectedEvent() {
        onClick(eventDetail());
    }

    //=========TCTRANSAKSI04======
    @Step
    public void userClickShopingButtonMenu() {
        onClick(shoppingTransaksiBtn());
    }
    @Step
    public void userSeeTheDetailsListOfTransactionShopingDisplayed() {
        Assert.assertTrue(waitUntilVisible(shoppingTransaksiPage()).isDisplayed());
    }

    //=========TCTRANSAKSI05======
    @Step
    public void userClickOnTheSelectedShoping() {
        onClick(shoppingDetail());
    }
    @Step
    public void adminSeeTheDetailedTransactionShopingDataThatIsDisplayed() {
        Assert.assertTrue(waitUntilVisible(shoppingDetailPage()).isDisplayed());
    }
}
