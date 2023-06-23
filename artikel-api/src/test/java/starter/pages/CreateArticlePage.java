package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateArticlePage {
    public String token = "";
    protected String loginEndpoint = "http://167.172.66.247:8002/";
    public String setEndpointAuth() {
        return loginEndpoint + "user_login";
    }

    public void sendReqToEndpointAuth() {
        String body = "{\n" +
                "    \"email\": \"alifah@gmail.com\",\n" +
                "    \"password\": \"alifah123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(setEndpointAuth());
                token = lastResponse().getBody().jsonPath().get("data.token");
    }
    public String endpointCreateArticle= "http://167.172.66.247:8002/";
    public String setEndpointToCreateAticle() {
        return endpointCreateArticle + "artikel";
    }

    public void sendReqToCreateArticle() {
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
                .contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .body(reqBody.toString())
                .post(setEndpointToCreateAticle());
    }

    public void validateWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void validateDataNewArticle() {
        Response response = SerenityRest.lastResponse();
        String judul = response.getBody().jsonPath().get("data.judul");
        Assert.assertEquals(judul, "kecak 2");
    }

    // ================================= invalid endpoint =======================================
    public String InvalidEndpointCreateArticle= "http://167.172.66.247:8002/article";
    public String setInvalidEndpointNewArtcile() {
        return InvalidEndpointCreateArticle;
    }

    public void sendeqToInvalidNewAticle() {
        String gambar = "123.png";
        String judul = "kecak 2";
        String isi = "abc";

        String body = "{\n" +
                "    \"gambar\":" + gambar + ",\n" +
                "    \"judul\":" + judul + ",\n" +
                "    \"isi\":" + isi + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setInvalidEndpointNewArtcile());
    }

    public void validateStatusCode() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void validatePesanError() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "missing or malformed jwt");
    }
}
