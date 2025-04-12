package steps_json_parse;

import io.qameta.allure.Step;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("java:S2142")
public class ArraysJsonParserExample {

    public String pathCounters = "src/test/java/steps_json_parse/json_File/arraysExample.json";

    @Step("Получаем данные по age")
    public int getAgeInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(pathCounters));
        Integer ageInfo = jsonNode.get("age").asInt();
        return ageInfo;
    }

    @Step("Получаем данные по total")
    public JsonNode getNameInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(pathCounters));
        JsonNode nameInfo = jsonNode.get("cars").get(0).get("name");
        return nameInfo;
    }


    @Step("Получаем данные по models")
    public JsonNode getModelsInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(pathCounters));
        JsonNode modelsInfo = jsonNode.get("cars").get(0).get("models");
        return modelsInfo;
    }

    @Step("Получаем данные по models 2-го элемента")
    public JsonNode getSecondElModelsInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(pathCounters));
        JsonNode secondElModelsInfo = jsonNode.get("cars").get(0).get("models").get(2);
        return secondElModelsInfo;
    }

    @Step("Получаем данные по models 2-го элемента")
    public String getSecondElModelsInfoValueOf() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File(pathCounters));
        String secondElModelsInfo = String.valueOf(jsonNode.get("cars").get(0).get("models").get(2));
        return secondElModelsInfo;
    }

    public static void main(String[] args) throws IOException {

        ArraysJsonParserExample commonJsonParserExample = new ArraysJsonParserExample();

        System.out.println(commonJsonParserExample.getAgeInfo());
        System.out.println(commonJsonParserExample.getNameInfo());
        System.out.println(commonJsonParserExample.getModelsInfo());
        System.out.println(commonJsonParserExample.getSecondElModelsInfo());
        System.out.println(commonJsonParserExample.getSecondElModelsInfoValueOf());
    }
}
