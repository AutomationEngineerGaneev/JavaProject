package api_methods.base_arrays_example.lombok;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonInclude;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import lombok.Data;
import org.json.JSONObject;

import java.io.IOException;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String jsonUser() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setName("Джон Доу");
        user.setAge(30);

        String jsonString = mapper.writeValueAsString(user);
        return jsonString;
    }

//    Для простой работы с JSON без необходимости во многих зависимостях можно воспользоваться библиотекой org.json:
    public String jsonObject() throws IOException {
        JSONObject json = new JSONObject()
                .put("username", "devGenius")
                .put("score", 99)
                .put("details", new JSONObject()
                        .put("streak", "5 дней")
                        .put("location", "StackOverflow"));

//        System.out.println(json); // Выводим сформированный JSON.
        return String.valueOf(json);
    }

    public static void main(String[] args) throws IOException {
        User user = new User();
        System.out.println("1." + user.jsonUser());
        System.out.println("2." + user.jsonObject()); // Выводим сформированный JSON.
    }
}