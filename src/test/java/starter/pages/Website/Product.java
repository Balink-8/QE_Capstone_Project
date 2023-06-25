package starter.pages.Website;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Product{

    protected String endpoint = "http://167.172.66.247:8002";

    public static String token = "";

    @Step("I have endpoint auth")
    public String setPostEndpointAuth(){
        return endpoint + "/admin_login";
    }

    @Step ("I Send endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step ("I set Get API endpoint product")
    public String setGETApiEndpointProduct(){
        return endpoint + "/produk?page=1&limit=5&order=desc";
    }

    @Step("I send GET HTTP request Get product")
    public void sendGetHttpRequestGetProduct() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(setGETApiEndpointProduct());
    }

    @Step("I receive valid HTTP response code Get product 200")
    public void validateResponseCodeGetProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ("I set Get API endpoint Product by ID")
    public String setGETApiEndpointProductByID(){
        return endpoint + "/produk/43";
    }

    @Step("I send GET HTTP request Get Product By ID")
    public void sendGetHttpRequestGetProductByID() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(setGETApiEndpointProductByID());
    }

    @Step("I receive valid HTTP response code Get Product 200")
    public void validateResponseCodeGetProductByID() {
        restAssuredThat(response -> response.statusCode(200));}

    @Step ("I set POST API endpoint Product")
    public String setPOSTApiEndpointProduct(){
        return endpoint + "/produk";
    }

    @Step("I send POST HTTP request Product")
    public void sendPOSTHttpRequestProduct() {
        String body = "{\n" +
                "    \"kategori_id\": \"1\",\n" +
                "    \"nama\": \"Produk 1\",\n" +
                "    \"deskripsi\": \"Lorem Ipsum\",\n" +
                "    \"harga\": 45000,\n" +
                "    \"stok\": 15\n" +
                "}";


        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization","Bearer " + token).body("[\n" + reqBody.toString() + "\n]").post(setPOSTApiEndpointProduct());
    }

    @Step("I receive valid HTTP response code POST Product 200")
    public void validateResponseCodePOSTProduct() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setPOSTApiEndpointProduct());
        restAssuredThat(response -> response.statusCode(200));}

    @Step("admin set the PUT api endpoint Product")
    public String adminSetThePUTApiEndpointProduct(){
        return endpoint + "/produk/41";
    }
    @Step("admin sent HTTP PUT request get Product by ID")
    public void adminSentHTTPPUTRequestGetProductByID(){
        String body = "{\n" +
                "    \"kategori_id\": \"1\",\n" +
                "    \"nama\": \"Produk 1.1\",\n" +
                "    \"deskripsi\": \"Lorem Ipsum\",\n" +
                "    \"harga\": 45000,\n" +
                "    \"stok\": 15\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").header("Authorization", "Bearer " + token).body(reqBody.toString()).put(adminSetThePUTApiEndpointProduct());
    }
    @Step("admin receive valid data for Product by ID")
    public void adminReceiveValidDataForProductByID(){
        restAssuredThat(response -> response.statusCode(200));}

    @Step("I set Delete api endpoints delete product")
    public String setApiEndpointDeleteProduct() {
        return endpoint + "/produk/41";
    }

    @Step("I send Delete HTTP request Delete Product")
    public void sendDeleteHttpRequestGetProduct() {
        SerenityRest.given().header("Authorization","Bearer " + token).delete(setApiEndpointDeleteProduct());
    }

    @Step("I receive valid HTTP response code Delete product 200")
    public void validateResponseCodeDeleteProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

