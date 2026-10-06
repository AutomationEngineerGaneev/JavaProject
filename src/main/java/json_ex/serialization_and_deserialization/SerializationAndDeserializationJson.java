package json_ex.serialization_and_deserialization;

import api_methods.base_arrays_example.lombok.User;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

// Пример с Jackson

public class SerializationAndDeserializationJson {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Объект в JSON (сериализация)
        UserEx userEx = new UserEx("Алексей", 30);
        String jsonString = mapper.writeValueAsString(userEx);
        System.out.println("JSON: " + jsonString);
        // Результат: {"name":"Алексей","age":30}

        // JSON в объект (десериализация)
        User restoredUser = mapper.readValue(jsonString, User.class);
        System.out.println("Имя: " + restoredUser.getName());
    }
}
