package demoApiTest;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import testUtils.TestUtils;
import utils.ApiUtils;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    public Response res = null; //Response
    public JsonPath jp = null; //JsonPath


    TestUtils testUtils = new TestUtils();

    @BeforeAll
    public void setup() {
        //Test Setup
        ApiUtils.setBaseURI(); //Setup Base URI
        ApiUtils.setBasePath("api"); //Setup Base Path
        ApiUtils.setContentType(ContentType.JSON); //Setup Content Type
    }

    @AfterAll
    public void afterTest() {
        //Reset Values
        ApiUtils.resetBaseURI();
        ApiUtils.resetBasePath();
    }
}
