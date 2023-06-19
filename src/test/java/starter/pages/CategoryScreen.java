package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CategoryScreen extends BasePageObject{
    private By shopButton(){
        return AppiumBy.id("Shop Tab 3 of 4");
    }
    private By clothingButtonMenu(){
        return AppiumBy.xpath("//android.widget.ImageView[@index='0']");
    }
    private By handyCraftsButtonMenu(){
        return AppiumBy.xpath("//android.widget.ImageView[@index='1']");
    }
    private By BagsButtonMenu(){
        return AppiumBy.xpath("//android.widget.ImageView[@index='2']");
    }
    private By balineseMaskButtonMenu(){
        return AppiumBy.xpath("//android.widget.ImageView[@index='3']");
    }
    private By endekShirtButtonMenu(){
        return AppiumBy.id("Kemeja Endek Strait Motif Bali pop Rp. 90.000 162 Terjual");
    }
    private By wallDecorationButtonMenu(){
        return AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Hiasan Dinding Hand Made Khas Bali Rp. 90.000 162 Terjual\"])[1]");
    }
    private By PremiumQualityBagButtonMenu(){
        return AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Tas Kualitas Premium Rp. 90.000 162 Terjual\"])[1]");
    }
    private By PremiumBalineseMaskButtonMenu(){
        return AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Topeng Bali Premium Rp. 90.000 162 Terjual\"])[1]");
    }
    private By detailEndekShirtPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    private By detailWallDecorationPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    private By detailPremiumQualityBagPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    private By detailPremiumBalineseMaskPage(){
        return AppiumBy.xpath("//android.widget.ScrollView[@index='0']");
    }
    @Step
    public void clickShopButton(){
        onClick(shopButton());
    }
    @Step
    public void clickClothingButtonMenu(){
        onClick(clothingButtonMenu());
    }
    @Step
    public void clickHandyCraftsButtonMenu(){
        onClick(handyCraftsButtonMenu());
    }
    @Step
    public void clickBagsButtonMenu(){
        onClick(BagsButtonMenu());
    }
    @Step
    public void clickBalineseMaskButtonMenu(){
        onClick(balineseMaskButtonMenu());
    }
    @Step
    public void clickEndekShirt(){
        onClick(endekShirtButtonMenu());
    }
    @Step
    public void clickWallDecorationButtonMenu(){
        onClick(wallDecorationButtonMenu());
    }
    @Step
    public void clickPremiumQualityBagButtonMenu(){
        onClick(PremiumQualityBagButtonMenu());
    }
    @Step
    public void clickPremiumBalineseMaskButtonMenu(){
        onClick(PremiumBalineseMaskButtonMenu());
    }
    @Step
    public void userOnTheEndekShirtDetailProductPage(){
        Assert.assertTrue(waitUntilVisible(detailEndekShirtPage()).isDisplayed());
    }
    @Step
    public void userOnTheWallDecorationDetailProductPage(){
        Assert.assertTrue(waitUntilVisible(detailWallDecorationPage()).isDisplayed());
    }
    @Step
    public void userOnThePremiumQualityBagDetailProductPage(){
        Assert.assertTrue(waitUntilVisible(detailPremiumQualityBagPage()).isDisplayed());
    }
    @Step
    public void userOnThePremiumBalineseMaskDetailProductPage(){
        Assert.assertTrue(waitUntilVisible(detailPremiumBalineseMaskPage()).isDisplayed());
    }
}
