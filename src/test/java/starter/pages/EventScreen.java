package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class EventScreen extends BasePageObject{
    private By eventBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Event Tab 2 of 4\"]");
    }
    private By eventPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
    }
    private By selectedEvent() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"tari kecak banget tari kecak banget\"]");
    }
    private By detailEvent() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");
    }
    private By orderBtn() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Pesan Sekarang\"]");
    }
    private By amountTickect() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"tari kecak banget tari kecak banget Tiket Rp 0 1 Total Rp 0 \"]/android.widget.ImageView[6]");
    }
    private By buyBtn() {
        return AppiumBy.xpath("");
    }
    private By checkoutPage() {
        return AppiumBy.xpath("");
    }
    private By paymentBtn() {
        return AppiumBy.xpath("");
    }
    private By choosePayment() {
        return AppiumBy.xpath("");
    }
    private By nextBtn() {
        return AppiumBy.xpath("");
    }
    private By makeOrderBtn() {
        return AppiumBy.xpath("");
    }
    private By codePayment() {
        return AppiumBy.xpath("");
    }
    private By uplodPayment() {
        return AppiumBy.xpath("");
    }
    private By successfull() {
        return AppiumBy.xpath("");
    }

    @Step
    public void userClickEventButtonMenu() {
        onClick(eventBtn());
    }
    @Step
    public void userOnTheEventPage() {
        Assert.assertTrue(waitUntilVisible(eventPage()).isDisplayed());
    }
    @Step
    public void userClickOnTheSelectedEvents() {
        onClick(selectedEvent());
    }
    @Step
    public void userSeeTheDetailedEvents() {
        Assert.assertTrue(waitUntilVisible(detailEvent()).isDisplayed());
    }
    @Step
    public void userClickOrderNowButton() {
        onClick(orderBtn());
    }
    @Step
    public void userEnterTheNumberOfTickets() {
        onClick(amountTickect());
    }
    @Step
    public void userClickBuyNowButton() {
        onClick(buyBtn());
    }
    @Step
    public void userToCheckoutPage() {
        Assert.assertTrue(waitUntilVisible(checkoutPage()).isDisplayed());
    }
    @Step
    public void userClickPaymentMethod() {
        onClick(paymentBtn());
    }
    @Step
    public void userChooseAPaymentMethod() {
        onClick(choosePayment());
    }
    @Step
    public void userClickNextButton() {
        onClick(nextBtn());
    }
    @Step
    public void userClickMakeAnOrderButton() {
        onClick(makeOrderBtn());
    }
    @Step
    public void userOnThePaymentCodePage() {
        Assert.assertTrue(waitUntilVisible(codePayment()).isDisplayed());
    }
    @Step
    public void userClickUploadProofOfPaymentButton() {
        onClick(uplodPayment());
    }
    @Step
    public void userSuccessfullyPerformsACheckoutEvent() {
        Assert.assertTrue(waitUntilVisible(successfull()).isDisplayed());
    }
}
