package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateProductPage {
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
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointAuthForLogin());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }


    public String setEndpointForUpdateproduct() {
        return url + "produk/1";
    }

    public void sendReqForUpdateProduct() {
        String kategori_id = "1";
        String nama = "Produk Alifah";
        String deskripsi = "ini produk alifah";
        String harga = "45000";
        String stok = "100";

        String body = "{\n" +
                "    \"kategori_id\":" + kategori_id + ",\n" +
                "    \"nama\":" + nama + ",\n" +
                "    \"deskripsi\":" + deskripsi + ",\n" +
                "    \"harga\":" + harga + ",\n" +
                "    \"stok\":" + stok + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(setEndpointForUpdateproduct());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    public void validateWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void validateDataUpdateProduct() {
        Response response = SerenityRest.lastResponse();
        String description = response.getBody().jsonPath().get("description");
        Assert.assertEquals(description, "ini produk alifah");
    }

    // ================================== INVALID ENDPOINT =================================
    public String setInvalidEndpointForUpdateProduct() {
         return url + "product/1";
    }

    public void sendReqToInvalidEndpoint() {
        String kategori_id = "1";
        String nama = "Produk Alifah";
        String deskripsi = "ini produk alifah";
        String harga = "45000";
        String stok = "100";

        String body = "{\n" +
                "    \"kategori_id\":" + kategori_id + ",\n" +
                "    \"nama\":" + nama + ",\n" +
                "    \"deskripsi\":" + deskripsi + ",\n" +
                "    \"harga\":" + harga + ",\n" +
                "    \"stok\":" + stok + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(setInvalidEndpointForUpdateProduct());
    }

    public void validateResponseWithCodeStatus() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void validateMessageErrorResponse() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Not Found");
    }
}
