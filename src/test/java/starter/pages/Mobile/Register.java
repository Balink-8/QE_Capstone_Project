package starter.pages.Mobile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    public String endpoint = "http://167.172.66.247:8002/user_register";

    @Step("I have endpoint Register")
    public String setPostEndpointRegister() {
        return endpoint;
    }

    @Step("i send method post endpoint Register")
    public void sendPostHttpRequestRegister() {

        String body = "{\n" +
                "    \"nama\": \"Sean 1\",\n" +
                "    \"foto_profile\": \"123\",\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\",\n" +
                "    \"no_telepon\": \"0811111111111\",\n" +
                "    \"alamat\": \"Jl. 123\"\n" +
                "}";


        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointRegister());
    }

    @Step("i see response code Register")
    public void validateResponseCodeRegister() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
