package testUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class TestUtils {

    public void checkStatusIs200(Response res) {
        Assertions.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }

    public ArrayList getClients(JsonPath jp) {
        ArrayList clientList = jp.get();
        return clientList;
    }
}
