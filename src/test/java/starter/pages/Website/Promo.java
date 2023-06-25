package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Promo {
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

    @Step ("I set Get API endpoint promo")
    public String setGETApiEndpointPromo(){
        return endpoint + "/promo?page=1&limit=10";
    }

    @Step("I send GET HTTP request Get Promo")
    public void sendGetHttpRequestGetPromo() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(setGETApiEndpointPromo());
    }

    @Step("I receive valid HTTP response code Get promo 200")
    public void validateResponseCodeGetPromo() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ("I set Get API endpoint promo by ID")
    public String setGETApiEndpointPromoByID(){
        return endpoint + "/promo/16";
    }

    @Step("I send GET HTTP request Get Promo By ID")
    public void sendGetHttpRequestGetPromoByID() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(setGETApiEndpointPromoByID());
    }

    @Step("I receive valid HTTP response code Get promo 200")
    public void validateResponseCodeGetPromoByID() {
        restAssuredThat(response -> response.statusCode(200));}

    @Step ("I set POST API endpoint promo")
    public String setPOSTApiEndpointPromo(){
        return endpoint + "/promo";
    }

    @Step("I send POST HTTP request Promo")
    public void sendPOSTHttpRequestPromo() {
        String body = "{\n" +
                "    \"nama\": \"Juni\",\n" +
                "    \"kode\": \"123Juni\",\n" +
                "    \"deskripsi\": \"Promo Juni\",\n" +
                "    \"potongan_harga\": 20000\n" +
                "}";


        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization","Bearer " + token).body("[\n" + reqBody.toString() + "\n]").post(setPOSTApiEndpointPromo());
    }

    @Step("I receive valid HTTP response code POST promo 200")
    public void validateResponseCodePOSTPromo() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setPOSTApiEndpointPromo());
        restAssuredThat(response -> response.statusCode(200));}
}
