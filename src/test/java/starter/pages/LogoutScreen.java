package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutScreen extends BasePageObject{
    private By profileButton(){
        return AppiumBy.xpath("//android.widget.ImageView[@index=\"3\"]");
    }
    private By settingsButton(){
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Pengaturan\"]");
    }
    private By logoutButton(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Keluar\"]");
    }
    private By logoutButton2(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Keluar\"]");
    }
    @Step
    public void userClickProfileButtonMenu(){
        onClick(profileButton());
    }
    @Step
    public void userClickSettingsButtonMenu(){
        onClick(settingsButton());
    }
    @Step
    public void userClickLogoutButton(){
        onClick(logoutButton());
    }
    @Step
    public void userClickLogOutButton2(){
        onClick(logoutButton2());
    }
}
