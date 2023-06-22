package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EventPage {
    protected String url = "167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login")
    public String adminSetUpApiEndpointLogin(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login")
    public void adminSendSAHTTPRequestLogin(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLogin());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("admin set the POST api endpoint event")
    public String adminSetThePOSTApiEndpointEvent(){
        return url + "event";
    }
    @Step("admin sent HTTP POST request post event")
    public void adminSentHTTPPOSTRequestPostEvent(){
        String body = "{\n" +
                "    \"artikel_id\": \"1\",\n" +
                "    \"gambar\": \"123\",\n" +
                "    \"nama\": \"Kecak 2\",\n" +
                "    \"deskripsi\": \"Lorem Ipsum\",\n" +
                "    \"harga_tiket\": 45000,\n" +
                "    \"stok_tiket\": 15,\n" +
                "    \"waktu_mulai\": \"10.00\",\n" +
                "    \"waktu_selesai\": \"12.00\",\n" +
                "    \"tanggal_mulai\": \"12 Desember 2012\",\n" +
                "    \"tanggal_selesai\": \"12 Desember 2012\",\n" +
                "    \"lokasi\": \"Jln. 123\",\n" +
                "    \"link_lokasi\": \"123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").post(adminSetThePOSTApiEndpointEvent());
    }
    @Step("admin receive a valid login and event HTTP response code 200")
    public void adminReceiveAValidLoginAndEventHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointEvent());
        restAssuredThat(response -> response.statusCode(200));
    }

}
