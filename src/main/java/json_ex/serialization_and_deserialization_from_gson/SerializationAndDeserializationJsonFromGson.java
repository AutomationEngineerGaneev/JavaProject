package json_ex.serialization_and_deserialization_from_gson;

import com.google.gson.Gson;
import json_ex.serialization_and_deserialization.UserEx;

// Пример с Gson
//  Сериализация — превращаем Java-объект в JSON-строку.
//  Десериализация — превращаем JSON-строку в Java-объект.
public class SerializationAndDeserializationJsonFromGson {

    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();

        UserEx userEx = new UserEx("Мария", 25);

        // Сериализация
        String json = gson.toJson(userEx);
        System.out.println("JSON Gson: " + json);

        // Десериализация
        UserEx userFromGson = gson.fromJson(json, UserEx.class);
        System.out.println("Восстановлен: " + userFromGson.getName());
    }
}
