package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutScreen extends BasePageObject{
    private By productButton(){
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Kain Endek Strait Motif Bali Rp 95000 15 Terjual\"]");
    }
    private By detailProductPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    private By buyButton(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Beli Sekarang\"]");
    }
    private By buyButton2(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Beli Sekarang\"]");
    }
    private By checkoutPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='1']");
    }
    private By BCAPaymentMethod(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"BCA Bank Central Asia\"]");
    }
    private By mandiriPaymentMethod(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Bank Mandiri\"]");
    }
    private By paymentCodePage(){
        return AppiumBy.xpath("//android.view.View[@index='1']");
    }

    @Step
    public void clickProductButton(){
        onClick(productButton());
    }
    @Step
    public void userOnTheProductPageScreen(){
        Assert.assertTrue(waitUntilVisible(detailProductPage()).isDisplayed());
    }
    @Step
    public void clikBuyButton(){
        onClick(buyButton());
    }
    @Step
    public void clickBuyButton2(){
        onClick(buyButton2());
    }
    @Step
    public void userOnTheCheckoutPage(){
        Assert.assertTrue(waitUntilVisible(checkoutPage()).isDisplayed());
    }
    @Step
    public void userClickBCAPaymentMethod(){
        onClick(BCAPaymentMethod());
    }
    @Step
    public void userClickMandiriPaymentMethod(){
        onClick(mandiriPaymentMethod());
    }
    @Step
    public void userOnThePaymentCodePage(){
        Assert.assertTrue(waitUntilVisible(paymentCodePage()).isDisplayed());
    }
}
