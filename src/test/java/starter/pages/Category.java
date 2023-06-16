package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Category extends PageObject {
    private By menuCategory(){
        return By.id("kategori");
    }
    private By addCategoryButton(){
        return By.xpath("//p[text()='Tambah Kategori']");
    }
    private By categoryNameField(){
        return By.xpath("//label[text()='Nama Kategori']/following-sibling::div/input");
    }
    private By descriptionCategoryField(){
        return By.id("deskripsiKategori");
    }
    private By simpanButton() {
        return By.xpath("//p[text()='Simpan']");
    }
    private By editButton(){
        return By.id("edit-icon");
    }
    private By deleteButtton(){
        return By.id("delete-icon");
    }
    @Step
    public void clickMenuCategory(){
        $(menuCategory()).click();
    }
    @Step
    public void clickAddCategory() {
        $(addCategoryButton()).click();
    }
    @Step
    public void inputCategoryName(String categoryName) {
        $(categoryNameField()).type(categoryName);
    }

    @Step
    public void inputCategoryDescription(String categoryDescription) {
        $(descriptionCategoryField()).type(categoryDescription);
    }
    @Step
    public void clickSimpanButton() {
        $(simpanButton()).click();
    }

    @Step
    public void clickEditButton(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("edit-icon")));
        hoverOverLocationSelector.perform();
        $(editButton()).click();
    }
    @Step
    public void clickDeleteButton(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("delete-icon")));
        hoverOverLocationSelector.perform();
        $(deleteButtton()).click();
    }
}
