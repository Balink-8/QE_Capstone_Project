package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class event {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in event")
    public String adminSetUpApiEndpointLoginEvent(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in event")
    public void adminSendSAHTTPRequestLoginEvent(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginEvent());
        token = lastResponse().getBody().jsonPath().get("data.token");
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
    @Step("admin received valid data for event")
    public void adminReceivedValidDataForEvent(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT02========
    @Step("admin set the GET api endpoint event")
    public String adminSetTheGETApiEndpointEvent(){
        return url + "event?page=1&limit=5&order=desc";
    }

    @Step("admin sent HTTP GET request get event")
    public void adminSentHTTPGETRequestGetEvent(){
        SerenityRest.given().get(adminSetTheGETApiEndpointEvent());
    }
    @Step("admin received valid data for event")
    public void adminReceiveValidDataForAllEvent(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT03========
    @Step("admin set the PUT api endpoint event")
    public String adminSetThePUTApEndpointEvent(){
        return url + "event/70";
    }
    @Step("admin sent HTTP PUT request post event")
    public void adminSentHTTPPUTRequestGetEventByID(){
        String body = "{\n" +
                "    \"artikel_id\": \"1\",\n" +
                "        \"gambar\": \"123\",\n" +
                "        \"nama\": \"Kecak 2\",\n" +
                "        \"deskripsi\": \"Lorem Ipsum\",\n" +
                "        \"harga_tiket\": 45000,\n" +
                "        \"stok_tiket\": 15,\n" +
                "        \"waktu_mulai\": \"10.00\",\n" +
                "        \"waktu_selesai\": \"12.00\",\n" +
                "        \"tanggal_mulai\": \"12 Desember 2012\",\n" +
                "        \"tanggal_selesai\": \"12 Desember 2012\",\n" +
                "        \"lokasi\": \"Jln. 123\",\n" +
                "        \"link_lokasi\": \"123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApEndpointEvent());
    }
    @Step("admin receive valid data for event by ID")
    public void adminReceiveValidDataForEventByID(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT04========
    @Step("admin set the DEL api endpoint event")
    public String adminSetTheDELApiEndpointEvent(){
        return url + "event/70";
    }

    @Step("admin sent HTTP DEL request event by ID")
    public void adminSentHTTPDELRequestEventByID(){
        SerenityRest.given().delete(adminSetTheDELApiEndpointEvent());
    }
    @Step("admin receive valid data for delete event")
    public void adminReceiveValidDataForDeleteEvent(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }
}
