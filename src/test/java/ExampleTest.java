import api_methods.base_arrays_example.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ExampleTest {

    @Test
    public void TestEx() throws IOException {
        User user = new User();
        System.out.println("1." + user.jsonUser());
        System.out.println("2." + user.jsonObject()); // Выводим сформированный JSON.
    }
}
