package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetArticlePage {
    public String token = "";
    protected String URL = "http://167.172.66.247:8002/";

    public String setEndpointFoAuth() {
        return URL + "user_login";
    }

    public void sendReqForGetAuth() {
        String body = "{\n" +
                "    \"email\": \"alifah@gmail.com\",\n" +
                "    \"password\": \"alifah123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(setEndpointFoAuth());
                token = lastResponse().getBody().jsonPath().get("data.token");
    }
    public String setEndpointForGetArticle() {
        return URL + "artikel";
    }
    public void sendReqForGetDataArticle() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEndpointForGetArticle());
    }
    public void ValidateDataWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void validateDataArticle() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Get all Artikel success");
    }
    // =================================== GET BY ID =============================
    public String setEndpointForGetArticleByID() {
            return URL + "artikel/29";
    }
    public void sendReqToEndpointForGetArticleByID() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEndpointForGetArticleByID());
    }
    public void validatWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void validateDataArticleByID() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Get Artikel success");
    }
    // ========================== INVALID ID PRODUCT =============================
    public String setEndpointWithInvalidID() {
        return URL + "artikel/10000";
    }
    public void sendReqToEndpointWithInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEndpointWithInvalidID());
    }
    public void validateResponseCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
    public void validateMessageResponse() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "record not found");
    }
    // ================= INVALID ENDPOINT =============================================
    public String invalidEndpoint() {
        return URL + "article";
    }
    public void sendToInvalidEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + token).get(invalidEndpoint());
    }
    public void validateStatusCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
    public void validateMessageError() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Not Found");
    }
}
