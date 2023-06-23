package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateArticlePage {
    public String token = "";
    protected String url = "http://167.172.66.247:8002/";
    public String setEndpointAuthForLogin() {
        return url + "user_login";
    }

    public void sendReqForLogin() {
        String body = "{\n" +
                "    \"email\": \"alifah@gmail.com\",\n" +
                "    \"password\": \"alifah123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(setEndpointAuthForLogin());
                token = lastResponse().getBody().jsonPath().get("data.token");
    }
    public String setEndpointForUpdateArticle() {
        return url + "artikel/81";
    }

    public void sendReqForUpdateArticle() {
        String gambar = "123.png";
        String judul = "kecak 2";
        String isi = "abc";

        String body = "{\n" +
                "    \"gambar\":" + gambar + ",\n" +
                "    \"judul\":" + judul + ",\n" +
                "    \"isi\":" + isi + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(reqBody.toString())
                .put(setEndpointForUpdateArticle());
    }

    public void validateWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void validateDataUpdateArticle() {
        Response response = SerenityRest.lastResponse();
        String judul = response.getBody().jsonPath().get("data.judul");
        Assert.assertEquals(judul, "kecak 2");
    }

    // ================================== INVALID ENDPOINT =================================
    public String setInvalidEndpointForUpdateArticle() {
         return url + "article/81";
    }

    public void sendReqToInvalidEndpoint() {
        String gambar = "123.png";
        String judul = "kecak 2";
        String isi = "abc";

        String body = "{\n" +
                "    \"gambar\":" + gambar + ",\n" +
                "    \"judul\":" + judul + ",\n" +
                "    \"isi\":" + isi + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);


        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(setInvalidEndpointForUpdateArticle());
    }

    public void validateResponseWithCodeStatus() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void validateMessageErrorResponse() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "missing or malformed jwt");
    }
}
