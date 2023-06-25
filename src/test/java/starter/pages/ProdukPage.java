package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProdukPage extends PageObject {
    private By ProdukMenu(){return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/ul/li[4]/a");}
    private By ProdukPage(){return By.xpath("//*[@id=\"navbarBrand\"]");}
    private By clickBtnTambahProduk(){return By.xpath("//*[@id=\"addProduk\"]");}
    private By TambahprodukPage(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/h1");}
    private By uploadImageProduk(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/div/div[2]/div[4]/label");}
    private By NamaProdukField(){return By.xpath("//*[@id=\"nama\"]");}
    private By kategoriProdukField(){return By.xpath("//*[@id=\"kategori_id\"]/option[2]");}

    private By hargaprodukField(){return By.xpath("//*[@id=\"harga\"]");}

    private By StokProdukField(){return By.xpath("//*[@id=\"stok\"]");}

    private By EditProdukPage(){return By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[1]/h1");}

    private By deleteProdukBtn(){return By.xpath("//*[@id=\"delete-icon\"]");}
    private By editProdukButton(){return By.xpath("//*[@id=\"edit-icon\"]");}

    private By btnLogin(){return By.xpath("//*[@id=\"login-button\"]");}

    private By EmailField(){return By.xpath("//*[@id=\"email\"]");}

    private By PasswordField(){return By.xpath("//*[@id=\"password\"]");}
    public void adminClickProdukMenu() {
        $(ProdukMenu()).click();
    }

    public void adminCanSeeProdukOnApp() {
        $(ProdukPage()).shouldBeVisible();
    }

    public void adminClickTambahProdukBtn() {
        $(clickBtnTambahProduk()).click();
    }

    public void adminOnTambahProdukPages() {
        $(TambahprodukPage()).shouldBeVisible();
    }

    public void inputForoProduk() {
        $(uploadImageProduk()).sendKeys("D:\\D\\QE_Alta\\QE_Capstone_Project_Web\\image\\events.png");
    }

    public void inputNamaProduk(String NamaProduk) {
        $(NamaProdukField()).type(NamaProduk);
    }

    public void inputKategoriProduk() {
        $(kategoriProdukField()).click();
    }

    public void inputHargaProduk(String HargaProduk) {
        $(hargaprodukField()).type(HargaProduk);
    }

    public void inputStokProduk(String StokProduk) {
        $(StokProdukField()).type(StokProduk);
    }

    public void validateProdukSuccessCreated() {
        $(ProdukPage()).shouldBeVisible();
    }

    public void onEditProdukPage() {
        $(EditProdukPage()).shouldBeVisible();
    }

    public void clickDeleteProdukBtn() {
        $(deleteProdukBtn()).click();
    }

    public void validateDeleteProduk() {
        $(ProdukPage()).shouldBeVisible();
    }

    public void validateEditedProduk() {
        $(ProdukPage()).shouldBeVisible();
    }

    public void editProdukBtn() {
        $(editProdukButton()).click();
    }

    public void onLoginPages() {
        open();
        $(btnLogin()).shouldBeVisible();
    }

    public void emailField(String email) {
        $(EmailField()).type(email);
    }

    public void passwordField(String password) {
        $(PasswordField()).type(password);
    }

    public void clickLoginBtn() {
        $(btnLogin()).click();
    }
}
