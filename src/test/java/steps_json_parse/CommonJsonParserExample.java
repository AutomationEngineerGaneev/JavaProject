package steps_json_parse;

import io.qameta.allure.Step;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("java:S2142")
public class CommonJsonParserExample {

    @Step("Получаем данные по unread")
    public int getUnreadMessagesInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("counters.json"));
        Integer unreadCounter = jsonNode.get("unread").asInt();
        return unreadCounter;
    }

    @Step("Получаем данные по total")
    public int getUnreadTotalMessagesInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("counters.json"));
        Integer unreadCounterTotal = jsonNode.get("total").asInt();
        return unreadCounterTotal;
    }

    @Step("Получаем данные по counter всех элементов")
    public JsonNode getUnreadMessagesInfoCounterArrays() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("counters.json"));
        JsonNode unreadCounterCounter = jsonNode.get("counter");
        return unreadCounterCounter;
    }

    @Step("Получаем данные по counter 1-го элемента")
    public JsonNode getUnreadMessagesInfoCounterArraysZero() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("counters.json"));
        JsonNode unreadCounterCounterZero = jsonNode.get("counter").get(0);
        return unreadCounterCounterZero;
    }

    @Step("Получаем данные по type")
    public JsonNode getUnreadMessagesInfoCounterArraysZeroType() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("counters.json"));
        JsonNode unreadCounterCounterZero = jsonNode.get("counter").get(0).get("type");
        return unreadCounterCounterZero;
    }

    public static void main(String[] args) throws IOException {

        CommonJsonParserExample commonJsonParserExample = new CommonJsonParserExample();

        System.out.println(commonJsonParserExample.getUnreadMessagesInfo());
        System.out.println(commonJsonParserExample.getUnreadTotalMessagesInfo());
        System.out.println(commonJsonParserExample.getUnreadMessagesInfoCounterArrays());
        System.out.println(commonJsonParserExample.getUnreadMessagesInfoCounterArraysZero());
        System.out.println(commonJsonParserExample.getUnreadMessagesInfoCounterArraysZeroType());
    }
}
