package api_methods.base_arrays_example;

import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import io.qameta.allure.internal.shadowed.jackson.databind.SerializationFeature;
import io.qameta.allure.internal.shadowed.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class APIArraysExample {

    //Давайте продемонстрируем, как преобразовать объект List в JSON
    //с помощью метода ObjectMapper.writeValueAsString().
    public String objectLang() throws JsonProcessingException {
        // Create ObjectMapper object.
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<String> progLangs = new ArrayList<>();
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Java");
        progLangs.add("Java EE");
        progLangs.add("Python");
        progLangs.add("Scala");
        progLangs.add("JavaScript");

        System.out.println("Объект List: " + progLangs);
        // Serialize Object to JSON.
        // Сериализация объекта в JSON.
        String json = mapper.writeValueAsString(progLangs);

        // Print json
        // System.out.println(json);
        return json;
    }

    @SuppressWarnings("unchecked")
    public List<String> objectLangList() throws IOException {
        // Create ObjectMapper object.
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = "[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";

        // Десериализация JSON в список.
        List<String> progLang1 = new ArrayList<>();
        progLang1 = mapper.readValue(json, List.class);
        return progLang1;
    }

    @SuppressWarnings("unchecked")
    public String objectLangListIterator() throws IOException {
        // Create ObjectMapper object.
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = "[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";

        List<String> progLang2 = new ArrayList<>();
        progLang2 = mapper.readValue(json, List.class);

        //Десериализация JSON в список(с учетом итератора)
        String language = null;
        for (Iterator<String> iterator = progLang2.iterator(); iterator.hasNext(); ) {
            language = (String) iterator.next();
            System.out.println("3. Десериализация JSON в список(с учетом итератора):" + " " + language);
        }
        return language;
    }

    //Чтобы создать JSON в Java с минимальными усилиями, вы можете
    // использовать ObjectMapper и ObjectNode из библиотеки Jackson.
    // Эти классы предоставляют удобный механизм цепочечного вызова методов для построения JSON:
    public String jsonNodeString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode()
                .put("name", "Джон Доу")
                .put("age", 30)
                .set("contact", mapper.createObjectNode()
                        .put("email", "john@example.com")
                        .put("phone", "123-456-7890"));

        String jsonString = mapper.writeValueAsString(json);
//        System.out.println(jsonString); // Выводим сформированный JSON.
        return jsonString;
    }


//    Jackson предлагает JsonNode и ObjectNode для гибкой работы с JSON.
//    Эти классы позволяют изменять содержимое JSON на лету:
    public String jsonUserString() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode json = mapper.createObjectNode();
        json.put("user", "coder123")
                .putObject("preferences")
                .put("language", "Java")
                .put("theme", "Dark");

        json.withArray("achievements")
                .add("Ответил на 1000 вопросов на StackOverflow")
                .add("Автор лучшего ответа по Java");

        String output = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
//        System.out.println(output); // Выводим красиво отформатированный JSON.
        return output;
    }

    public static void main(String[] args) throws IOException {
        APIArraysExample APIArraysExample = new APIArraysExample();

        System.out.println("1. Сериализация объекта в JSON:" + " " + APIArraysExample.objectLang());
        System.out.println("2. Десериализация JSON в список:" + " " + APIArraysExample.objectLangList());
        System.out.println("3." + APIArraysExample.objectLangListIterator());
        System.out.println("4." + APIArraysExample.jsonNodeString());
        System.out.println("5." + APIArraysExample.jsonUserString());
    }
}
