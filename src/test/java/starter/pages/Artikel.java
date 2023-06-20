package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Artikel extends PageObject {

    private By menuArtikel(){return By.id("artikel");}
    private  By articleDetail(){return By.xpath("//tr[@class='_tableRow_7hqxp_66']");}
    private By addNewArticle(){return By.id("tambah-artikel-button");}
    private By inputPhoto(){return By.id("pilihFotoButton");}
    private By inputTitle(){return By.id("judul");}
    private By inputDescription(){return By.id("deskripsi");}
    private By buttonSave(){return By.id("submitButton");}
    private By manageAddNewArticle(){return By.id("navbarBrand");}

    private By iconEditArticle(){return By.id("edit-button");}
    private By save(){return By.id("saveButton");}
    private By deleteIcon(){return By.id("delete-button");}
    private By buttonYes(){return By.id("modalKonfirmasiYesButton");}


    @Step
    public void clickMenuArtikel(){
        $(menuArtikel()).click();
    }

    @Step
    public void clickArticleDetail(){
        $(articleDetail()).click();
    }

    @Step
    public void clickButtonAddNewArticle(){
        $(addNewArticle()).click();
    }

    @Step
    public void adminInputPhoto(){
        WebElement fileInput = getDriver().findElement(By.id("pilihFotoButton"));
        fileInput.sendKeys("C:\\Users\\Lenovo\\Downloads\\Telegram Desktop\\gambar.png");
    }

    @Step
    public void adminInputTitleArticle(String title){
        $(inputTitle()).type(title);
    }

    @Step
    public void adminInputDescriptionArticle(String description){
        $(inputDescription()).type(description);
    }

    @Step
    public void adminClickButtonSave(){
        $(buttonSave()).click();
    }

    @Step
    public void adminManageAddNewArticle(){
        $(manageAddNewArticle()).shouldBeVisible();

    }

    @Step
    public void adminClickIconEditArticle(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("edit-button")));
        hoverOverLocationSelector.perform();
        $(iconEditArticle()).click();
    }

    @Step
    public void adminClickSaveButton(){
        $(save()).click();
    }

    @Step
    public void adminClickDeleteIcon(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("delete-button")));
        hoverOverLocationSelector.perform();
        $(deleteIcon()).click();
    }

    @Step
    public void adminClickButtonYes(){
        $(buttonYes()).click();
    }

}
