package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductPage {
    public String token = "";
    protected String urL = "http://167.172.66.247:8002/";

    public String setEndpointLoginUser() {
        return urL + "user_login";
    }

    public void sendReqForLoginUser() {
        String body = "{\n" +
                "    \"email\": \"alifah@gmail.com\",\n" +
                "    \"password\": \"alifah123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointLoginUser());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    public String setEndpointForDeleteProduct() {
        return urL + "produk/27";
    }

    public void sendRqForDeleteProduct() {
        SerenityRest.given().header("Authorization", "Bearer " + token).delete(setEndpointForDeleteProduct());
    }

    public void validateResponswCodeDelete() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void validateMessageResponse() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Delete Produk success");
    }

    // ====================== INVALID ENDPOINT =================================
    public String invalidEndpointForDeleteProduct() {
        return urL + "product/26";
    }
    public void sendReqToInvalidEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + token).delete(invalidEndpointForDeleteProduct());
    }
    public void validateWithStatusResponseCode() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void validateDataDeleteProductWithInvalidEndpoint() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Not Found");
    }
}
