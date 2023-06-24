package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Category;
import starter.pages.Login;

public class CategorySteps {
    @Steps
    Login login;

    @Steps
    Category category;
    @Given("admin has logged in dashboard Page")
    public void adminHasLoggedInDashboardPage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
    }

    @When("admin click Kategori button menu")
    public void adminClickKategoriButtonMenu() {
        category.clickMenuCategory();
    }

    @Then("admin see kategori details displayed")
    public void adminSeeKategoriDetailsDisplayed() {
        System.out.println("Anda melihat data kategori");
    }

    @And("admin click Tambah Kategori button menu")
    public void adminClickTambahKategoriButtonMenu() {
        category.clickAddCategory();
    }

    @And("admin input category name valid on the category name field")
    public void adminInputCategoryNameValidOnTheCategoryNameField() {
        category.inputCategoryName("Celana Chino");
    }

    @And("admin input category description valid on the category description field")
    public void adminInputCategoryDescriptionValidOnTheCategoryDescriptionField() {
        category.inputCategoryDescription("Tersedia size 27, 28, 29 dan 30");
    }

    @And("admin click simpan button")
    public void adminClickSimpanButton() {
        category.clickSimpanButton();
    }

    @And("admin click Edit Kategori button menu")
    public void adminClickEditKategoriButtonMenu() {
        category.clickEditButton();
    }

    @And("admin click Delete Kategori button menu")
    public void adminClickDeleteKategoriButtonMenu() {
        category.clickDeleteButton();
    }

    @Then("admin success delete category product")
    public void adminSuccessDeleteCategoryProduct() {
        System.out.println("Anda berhasil menghapus kategory");
    }
}
