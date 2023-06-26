package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;


public class SettingScreen extends BasePageObject {
    private By settingBtn() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Pengaturan\"]");
    }

    private By privacyPoliceBtn() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    }

    private By privacyPolicePage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By aboutUsMenu() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]");
    }

    private By termOfserviseMenu() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
    }

    private By termOfservisePage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By copyRightMenu() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]\n");
    }

    private By copyRightPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    //=========TCSETTING01======
    @Step
    public void userClickSettingButtonMenu() {
        onClick(settingBtn());
    }

    @Step
    public void userClickPrivacyPolicyMenu() {
        onClick(privacyPoliceBtn());
    }

    @Step
    public void userWillSeeThePrivacyPolicyPage() {
        Assert.assertTrue(waitUntilVisible(privacyPolicePage()).isDisplayed());
    }

    //=========TCSETTING02======
    @Step
    public void userClickAboutUsMenu() {
        onClick(aboutUsMenu());
    }

    @Step
    public void userClickTermOfServiceMenu() {
        onClick(termOfserviseMenu());
    }

    @Step
    public void userWillSeeTheTermOfServicePage() {
        Assert.assertTrue(waitUntilVisible(termOfservisePage()).isDisplayed());
    }

    //=========TCSETTING03======
    @Step
    public void userClickCopyrightPolicyMenu() {
        onClick(copyRightMenu());
    }

    @Step
    public void userWillSeeTheCopyrightPolicyPage() {
        Assert.assertTrue(waitUntilVisible(copyRightPage()).isDisplayed());
    }
}
