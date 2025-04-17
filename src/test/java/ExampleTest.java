import api_methods.base_arrays_example.lombok.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {

//    @Test
    public void TestEx() throws IOException {
        User user = new User();
        System.out.println("1." + user.jsonUser());
        System.out.println("2." + user.jsonObject()); // Выводим сформированный JSON.
    }

//    @Test
    public void get(){
        RestAssured.baseURI = "https://postman-echo.com";
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1", equalTo("bar1"));
    }
}
