package starter.pages;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateProductPage {
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
    public String endpointCreateProduct= "http://167.172.66.247:8002/";
    public String setEndpointToCreateProduct() {
        return endpointCreateProduct + "produk";
    }

    public void sendReqToCreateProduct() {
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

        SerenityRest.given()
                .contentType("application/json")
                .header("Authorization", "Bearer " + token)
                .body(reqBody.toString())
                .post(setEndpointToCreateProduct());
    }

    public void validateWithStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void validateDataNewProduct() {
        Response response = SerenityRest.lastResponse();
        String description = response.getBody().jsonPath().get("description");
        Assert.assertEquals(description, "ini produk alifah");
    }

    // ================================= invalid endpoint =======================================
    public String InvalidEndpointCreateProduct= "http://167.172.66.247:8002/product";
    public String setInvalidEndpointNewProduct() {
        return InvalidEndpointCreateProduct;
    }

    public void sendeqToInvalidNewProduct() { String kategori_id = "1";
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

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setEndpointToCreateProduct());
    }

    public void validateStatusCode() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void validatePesanError() {
        Response response = SerenityRest.lastResponse();
        String message = response.getBody().jsonPath().get("message");
        Assert.assertEquals(message, "Not Found");
    }
}
