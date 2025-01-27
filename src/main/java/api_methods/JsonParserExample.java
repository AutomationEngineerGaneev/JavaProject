package api_methods;

import io.qameta.allure.Step;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonParserExample {


    @Step("Пример")
    public void sendRequestGetIsTestService() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

    }

    public static void main(String[] args) throws IOException, InterruptedException {

        JsonParserExample jsonParserExample = new JsonParserExample();

    }
}
