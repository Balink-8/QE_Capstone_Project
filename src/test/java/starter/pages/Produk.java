package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Produk extends PageObject {
    private By produkBtn(){return By.id("produk");}
    private By produk(){return By.id("navbarBrand");}
    private By addBtn(){return By.id("addProduk");}

    private By nama(){return By.id("nama");}

    private By deskripsi(){return By.id("deskripsi");}
    private By kategori(){return By.id("kategori_id");}
    private By chooseKategori(){return By.xpath("//option[text()='Celana Chino']");}
    private By harga(){return By.id("harga");}
    private By stok(){return By.id("stok");}
    private By simpan(){return By.xpath("//p[text()='Simpan']");}
    public void theAdminClickOnTheProductMenu(){
        $(produkBtn()).click();
    }
    private By edit(){return By.id("edit-icon");}
    private By changenama(){return By.id("nama");}
    private By deleteBtn(){return By.id("delete-icon");}
    @Step
    public void adminCanSeeAllProduct() {
        $(produk()).shouldBeVisible();
    }

    //=========TCProduk02=========
    @Step
    public void adminOnTheProductPage() {
        $(produk()).shouldBeVisible();
    }
    public void adminClickTheAddProductButton() {
        $(addBtn()).click();
    }
    @Step
    public void adminClickTheProductPhotoButton(){

        WebElement fileInput = getDriver().findElement(By.id("boxFile"));
        fileInput.sendKeys("C:\\Users\\Lenovo\\Downloads\\gambar.webp");

    }
    @Step
    public void adminFillInTheProductName(String name){
        $(nama()).type(name);
    }
    @Step
    public void adminFillInThenProductDescription(String deskription){
        $(deskripsi()).type(deskription);
    }

    public void adminFillInTheProductCatagory(){
        $(kategori()).click();
        $(chooseKategori()).click();
    }
    @Step
    public void adminFillInThenProductPrice(String price){
        $(harga()).type(price);
    }
    @Step
    public void adminReplenishProductStock(String stok){
        $(stok()).type(stok);
    }
    public void adminClickSaveButton(){
        $(simpan()).click();
    }
    @Step
    public void adminSuccessfullyAddANewProduct() {
        $(produk()).shouldBeVisible();
    }

    public void adminClickEditOnOneOfTheProdukData(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("edit-icon")));
        hoverOverLocationSelector.perform();
        $(edit()).click();
    }
    @Step
    public void adminChangeTheProdukTitle(String changeNama){
        $(changenama()).type(changeNama);
    }
    @Step
    public void adminClickDeleteOnTheProdukDataThatYouWantToDelete(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("delete-icon")));
        hoverOverLocationSelector.perform();
        $(deleteBtn()).click();
    }
}
