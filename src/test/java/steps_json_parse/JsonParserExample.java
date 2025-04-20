package steps_json_parse;

import io.qameta.allure.Step;
import io.qameta.allure.internal.shadowed.jackson.core.type.TypeReference;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("java:S2142")
public class JsonParserExample {

    public String pathJsonNode = "src/test/java/steps_json_parse/json_File/arraysExampleJsonNode.json";

    @Step("Получаем данные")
    public void getInfo() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Parse JSON file to JsonNode
            JsonNode jsonNode = mapper.readTree(new FileReader(pathJsonNode));

            // Convert JsonNode to Map
            Map<String, Object> map = mapper.convertValue(jsonNode, new TypeReference<Map<String, Object>>() {
            });
            System.out.println("Map: " + map);

            // Convert JsonNode to List
            JsonNode phoneNumbersNode = jsonNode.get("phoneNumbers");
            List<Map<String, Object>> list = mapper.convertValue(phoneNumbersNode, new TypeReference<List<Map<String, Object>>>() {
            });
            System.out.println("List: " + list);



        } catch (IOException e) {
            System.out.println(" "+ e);
        }
    }


    public Map<String, Object> getInfoMap() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonNode = mapper.readTree(new FileReader(pathJsonNode));

        // Convert JsonNode to Map
        Map<String, Object> map = mapper.readValue(jsonNode.toString(), new TypeReference<Map<String, Object>>() {
        });
        System.out.println("Map: " + map);
        return map;
    }

    public List<Map<String, Object>> getInfoList() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonNode = mapper.readTree(new FileReader(pathJsonNode));
        // Convert JsonNode to List
        JsonNode phoneNumbersNode = jsonNode.get("phoneNumbers");
        List<Map<String, Object>> list = mapper.readValue(phoneNumbersNode.traverse(), new TypeReference<List<Map<String, Object>>>() {
        });
        System.out.println("List: " + list);
        return list;
    }

    public static void main(String[] args) throws IOException {

        JsonParserExample commonJsonParserExample = new JsonParserExample();

        commonJsonParserExample.getInfoList();

        String str = "[{type=home, number=555-555-5555}, {type=work, number=555-555-5556}]";

        System.out.println(str);
        assertEquals(commonJsonParserExample.getInfoList().toString(), str);
    }
}
