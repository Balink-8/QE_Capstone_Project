package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Profile extends PageObject {
    private By menuProfile(){
        return By.id("profile");
    }
    private By menuEditProfile() {
        return By.xpath("//p[text()='Edit Profil']");
    }
    private By emailField() {
        return By.xpath("//label[text()='Email']/following-sibling::div/input");
    }
    private By phoneNumber() {
        return By.xpath("//label[text()='No Telephone']/following-sibling::div/input");
    }
    private By whatsappNumber() {
        return By.xpath("//label[text()='Whatsapp']/following-sibling::div/input");
    }
    private By instagramUsername() {
        return By.xpath("//label[text()='Instagram']/following-sibling::div/input");
    }
    private By facebookUsername() {
        return By.xpath("//label[text()='Facebook']/following-sibling::div/input");
    }
    private By negaraField(){
        return By.xpath("//label[text()='Negara']/following-sibling::div/input");
    }
    private By kodePos(){
        return By.xpath("//label[text()='Kode Pos']/following-sibling::div/input");
    }
    private By alamat(){
        return By.xpath("//label[text()='Alamat']/following-sibling::div/input");
    }
    private By simpanButton() {
        return By.xpath("//p[text()='Simpan']");
    }
    @Step
    public void clickMenuProfile(){
        $(menuProfile()).click();
    }
    @Step
    public void clickMenuEditProfile(){
        $(menuEditProfile()).click();
    }
    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void inputPhoneNumber(String phoneNumber) {
        $(phoneNumber()).type(phoneNumber);
    }
    @Step
    public void inputWhatsappNumber(String whatsappNumber) {
        $(whatsappNumber()).type(whatsappNumber);
    }
    @Step
    public void inputInstagramUsername(String instagramUsername) {
        $(instagramUsername()).type(instagramUsername);
    }
    @Step
    public void inputFacebookUsername(String facebookUsername) {
        $(facebookUsername()).type(facebookUsername);
    }
    @Step
    public void inputNegaraField(String negara) {
        $(negaraField()).type(negara);
    }
    @Step
    public void inputKodePos(String kodePos) {
        $(kodePos()).type(kodePos);
    }
    @Step
    public void inputAlamat(String alamat) {
        $(alamat()).type(alamat);
    }
    @Step
    public void clickSimpanButton() {
        $(simpanButton()).click();
    }
}
