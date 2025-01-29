package api_methods.base_examples;

import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//Jackson — это популярная библиотека для сериализации/десериализации Java-объектов в различные текстовые форматы.
// Основной функционал для работы с форматом JSON — класс ObjectMapper.
// А работать с другими форматами помогут его наследники (XmlMapper, YAMLMapper).
// Благодаря наследованию работа со всеми форматами будет происходить единообразно, через единый интерфейс.
public class JsonAPIExample {

    //    Сериализация в JSON
    public String objectBook() throws JsonProcessingException {
        Book book = new Book();
        book.title = "Обитаемый остров";
        book.author = "Стругацкий А., Стругацкий Б.";
        book.pages = 413;

        ObjectMapper mapper = new ObjectMapper();
        String jsonBook = mapper.writeValueAsString(book);
        return jsonBook;
    }

    public String objectCat() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat cat = new Cat("Barsik", "Black");
        objectMapper.writeValue(new File("cat.json"), cat);
        String jsonCat = objectMapper.writeValueAsString(cat);
        return jsonCat;
    }

    //    Десериализация из JSON
    public Book objectReadBook() throws JsonProcessingException {
        String jsonString = "{\"title\":\"Обитаемый остров\",\"author\":\"Стругацкий А., Стругацкий Б.\",\"pages\":413}";
        Book book = new ObjectMapper().readValue(jsonString, Book.class);
        return book;
    }

    //    JSON в Jackson JsonNode
//    Также JSON может быть преобразован в объект JsonNode и использован для извлечения данных из определенного узла:
    public String objectReadTreeCat() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{ \"color\" : \"Black\", \"name\" : \"Barsik\" }";
        JsonNode jsonNode = objectMapper.readTree(json);
        String color = jsonNode.get("color").asText();
        return color;
    }

    public String objectReadTreeCatByFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("cat.json"));
        String color = jsonNode.get("color").asText();
        String name = jsonNode.get("name").asText();

        System.out.println("5. Display jsonNode by File:" + " " + jsonNode);
        System.out.println("5. Display name by File:" + " " + name);

        return color;
    }

    public static void main(String[] args) throws IOException {
        JsonAPIExample jsonAPIExample = new JsonAPIExample();
        System.out.println("1." + " " + jsonAPIExample.objectBook());
        System.out.println("2." + " " + jsonAPIExample.objectCat());
        System.out.println("3." + " " + jsonAPIExample.objectReadBook());
        System.out.println("4." + " " + jsonAPIExample.objectReadTreeCat());
        System.out.println("5. Display color by File:" + " " + jsonAPIExample.objectReadTreeCatByFile());

        //1.{"title":"Обитаемый остров","author":"Стругацкий А., Стругацкий Б.","pages":413}
        //2.{"name":"Barsik","color":"Black"}
        //3.Book{title='Обитаемый остров', author='Стругацкий А., Стругацкий Б.', pages=413}
        //4.Black
    }
}
