package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Event extends PageObject {
    private By dasboardPage(){return By.id("navbarBrand");}
    private By eventMenu(){return By.id("event");}
    private By eventPage(){return By.id("navbarBrand");}
    private By addEventBtn(){return By.id("tambahEvent");}
    private By titleEvent(){return By.id("judulEvent");}
    private By descriptionEvent(){return By.id("deskripsiEvent");}
    private By locationEvent(){return By.id("lokasiEvent");}
    private By googleMaps(){return By.id("linkGoogleEvent");}
    private By time(){return By.id("waktuEvent");}
    private By ticketMode(){return By.xpath("//button[@class='ant-switch css-12jzuas']");}
    private By price(){return By.id("linkGoogleEvent");}
    private By amount(){return By.id("waktuEvent");}
    private By save(){return By.xpath("//p[text()='Simpan']");}
    private By oneDataEditEvent(){return By.id("edit-icon");}
    private By changeTitle(){return By.id("judulEvent");}
    private By deleteBtn(){return By.id("delete-icon");}
    private By oneDataEvent(){return By.xpath("//td[text()='Tari Kecak']");}
    private By detailPage(){return By.xpath("//h1[text()='Detail Event']");}
    private By errorMsg(){return By.xpath("//h1[text()='Buat event baru']");}
    private By uploadFoto(){return By.xpath("//label[@class='_buttonMain_9dkz3_30']");}



    //======TCEVENT01==========
    @Step
    public void adminOnTheDashboardPage() {
        $(dasboardPage()).shouldBeVisible();
    }
    public void AdminClicksOnTheEventMenu(){
        $(eventMenu()).click();
    }
    public void AdminCanSeeAllEventData() {
        $(eventPage()).shouldBeVisible();
    }

    //======TCEVENT02==========
    @Step
    public void adminOnTheEventPage() {
        $(eventPage()).shouldBeVisible();
    }
    @Step
    public void adminClickTheAddEventButton(){
        $(addEventBtn()).click();
    }
    @Step
    public void adminClickTheSelectPhotoButton(){

        WebElement fileInput = getDriver().findElement(By.xpath("//label[@class='_buttonMain_9dkz3_30']"));
//        $(uploadFoto()).click();
        fileInput.sendKeys("C:\\Users\\Lenovo\\Downloads\\gambar.webp");

    }
    @Step
    public void adminFillsInTheEventTitle(String title){
        $(titleEvent()).type(title);
    }
    @Step
    public void adminFillsInTheEventDescription(String description){
        $(descriptionEvent()).type(description);
    }
    @Step
    public void adminFillsInTheLocationAddress(String address){
        $(locationEvent()).type(address);
    }
    @Step
    public void adminFillsInTheGoogleMapsLink(String link){
        $(googleMaps()).type(link);
    }
    @Step
    public void adminFillInTime(String time){
        $(time()).type(time);
    }
    public void adminClickPaidTicketMode(){
        $(ticketMode()).click();
    }
    @Step
    public void adminFillsInThePrice(String price){
        $(price()).type(price);
    }
    @Step
    public void adminFillsInTheAmount(String amount){
        $(amount()).type(amount);
    }
    @Step
    public void adminClickTheSaveButton(){
        $(save()).click();
    }

    //======TCEVENT03==========
    @Step
    public void adminClickOneDataEvent(){
        $(oneDataEvent()).click();
    }
    @Step
    public void adminOnDetailPage() {
        $(detailPage()).shouldBeVisible();
    }

    //======TCEVENT04==========
    @Step
    public void adminClickEditOnOneOfTheEventData(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("edit-icon")));
        hoverOverLocationSelector.perform();
        $(oneDataEditEvent()).click();
    }
    @Step
    public void adminChangeTheEventTitle(String newTitle){
        $(changeTitle()).type(newTitle);
    }

    //======TCEVENT05==========
    @Step
    public void adminClickDeleteOnTheEventDataThatYouWantToDelete(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("delete-icon")));
        hoverOverLocationSelector.perform();
        $(deleteBtn()).click();
    }

    //======TCEVENT07==========
    @Step
    public void adminStaysOnTheAddEventPage(){
        $(errorMsg()).shouldBeVisible();
    }
}
