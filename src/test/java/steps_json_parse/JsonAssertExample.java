package steps_json_parse;

import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonAssertExample {

    public String pathJson = "src/test/java/steps_json_parse/json_File/json_for_assert/employeeExample.json";
    public String pathJsonSecond = "src/test/java/steps_json_parse/json_File/json_for_assert/employeeExampleSecond.json";

    public void objectReadTreeCat() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode json = objectMapper.readTree(new File(pathJson));
        JsonNode jsonSecond = objectMapper.readTree(new File(pathJsonSecond));

        assertEquals(json, jsonSecond);

        System.out.println(json);
        System.out.println(jsonSecond);
    }

    public static void main(String[] args) throws IOException {

        JsonAssertExample jsonAPIExample = new JsonAssertExample();
        jsonAPIExample.objectReadTreeCat();
    }
}
