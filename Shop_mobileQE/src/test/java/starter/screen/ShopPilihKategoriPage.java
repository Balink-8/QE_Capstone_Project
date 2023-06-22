package starter.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import starter.pageobject.BasePageObject;

public class ShopPilihKategoriPage extends BasePageObject {
    // ================================================ LOCATOR =========================================================
    private By ClickEmailField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By ClickPasswordField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By ClickMenuShop () {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Shop\n" +
                "Tab 3 of 4\"]");
    }

    private By ClickKategoriPakaian () {
        return AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Pakaian\"])[1]");
    }

    private By ClickProduk () {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Produk 1.1\n" +
                "Rp 45000\n" +
                "15 Terjual\"]");
    }

    private By SeeDetailProduk () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Produk 1.1\"]");
    }

    private By EmailField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By PasswordField () {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By ClickBtnMasuk () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"LOG IN\"]");
    }

    private By HomePage () {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Shopping\"]");
    }

    // =============================================== FUNCTIONAL ====================================================================
    public void clickFieldEmail() {
        onClick(ClickEmailField());
    }

    public void clickFieldPassword() {
        onClick(ClickPasswordField());
    }

    public void clickMenuShop() {
        onClick(ClickMenuShop());
    }

    public void clickKategoriPakaian() {
        onClick(ClickKategoriPakaian());
    }

    public void clickProduk() {
        onClick(ClickProduk());
    }

    public void seeDetailProduk() {
        waitUntilVisible(SeeDetailProduk());
    }

    public void inputValidEmail(String email) {
        onType(EmailField(), email);
    }

    public void inputValidPassword(String password) {
        onType(PasswordField(), password);
    }

    public void clickBtnMasuk() {
        onClick(ClickBtnMasuk());
    }


    public void seeHomePage() {
        waitUntilVisible(HomePage());
    }
}
