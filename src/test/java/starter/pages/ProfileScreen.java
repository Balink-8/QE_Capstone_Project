package starter.pages;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProfileScreen extends BasePageObject{
    private By editBtn() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Edit\"]");
    }
    private By emailField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By tlpField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By addressField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By saveBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Simpan\"]\n");
    }
//    private By success() {
//        return AppiumBy.xpath("");
//    }

    @Step
    public void userClickEditButton(){
        onClick(editBtn());
    }
    @Step
    public void userInputOnEmailFieldInEdit(String email){
        onClick(emailField());
        onType(emailField(), email);
    }
    @Step
    public void userInputOnTelephoneNumberField(String numberTelephone){
        onClick(tlpField());
        onType(tlpField(), numberTelephone);
    }
    @Step
    public void userInputOnAddressField(String address){
        onClick(addressField());
        onType(addressField(), address);
    }
    @Step
    public void userClickSaveButton(){
        onClick(saveBtn());
    }

}
