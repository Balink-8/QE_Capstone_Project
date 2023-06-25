package starter.pages.Mobile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Event {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in event in mobile")
    public String adminSetUpApiEndpointLoginEventInMobile(){
        return url + "user_login";
    }
    @Step("admin send a HTTP request login in event in mobile")
    public void adminSendSAHTTPRequestLoginEventInMobile(){
        String body = "{\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginEventInMobile());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the POST api endpoint event in mobile")
    public String adminSetThePOSTApiEndpointEventInMobile(){
        return url + "event";
    }
    @Step("admin sent HTTP POST request post event in mobile")
    public void adminSentHTTPPOSTRequestPostEventInMobile(){
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
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").post(adminSetThePOSTApiEndpointEventInMobile());
    }
    @Step("admin receive a valid login and event HTTP response code 200 in mobile")
    public void adminReceiveAValidLoginAndEventHTTPResponseCode200InMobile(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointEventInMobile());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin received valid data for event in mobile")
    public void adminReceivedValidDataForEventInMobile(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT06========
    @Step("admin set the GET api endpoint event in mobile")
    public String adminSetTheGETApiEndpointEventInMobile(){
        return url + "event?page=1&limit=5&order=desc";
    }

    @Step("admin sent HTTP GET request get event in mobile")
    public void adminSentHTTPGETRequestGetEventInMobile(){
        SerenityRest.given().get(adminSetTheGETApiEndpointEventInMobile());
    }
    @Step("admin receive valid data for all event in mobile")
    public void adminReceiveValidDataForAllEventInMobile(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT07========
    @Step("admin set the PUT api endpoint event in mobile")
    public String adminSetThePUTApiEndpointEventInMobile(){
        return url + "event/70";
    }
    @Step("admin sent HTTP PUT request get event by ID in mobile")
    public void adminSentHTTPPUTRequestGetEventByIDInMobile(){
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
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointEventInMobile());
    }
    @Step("admin receive valid data for event by ID in mobile")
    public void adminReceiveValidDataForEventByIDInMobile(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCEVENT08========
    @Step("admin set the DEL api endpoint event in mobile")
    public String adminSetTheDELApiEndpointEventInMobile(){
        return url + "event?pagevent/61";
    }

    @Step("admin sent HTTP DEL request event by ID in mobile")
    public void adminSentHTTPDELRequestEventByIDInMobile(){
        SerenityRest.given().delete(adminSetTheDELApiEndpointEventInMobile());
    }
    @Step("admin receive valid data for delete event in mobile")
    public void adminReceiveValidDataForDeleteEventInMobile(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }
}
