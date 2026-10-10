package json_tests;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class JsonCheckValue {

    @Test
    void testCountTaskId() throws Exception {
        // Читаем JSON из файла
        File jsonFile = new File("src/test/resources/api-response.json");

        // Извлекаем все значения TaskId из каждого объекта массива
        List<String> taskIds = JsonPath.read(jsonFile, "$[*].TaskId");

        int actualCount = taskIds.size();
        System.out.println("Общее количество TaskId: " + actualCount);
    }

    @Test
    void testGetFirstTaskId() throws Exception {
        // Читаем JSON из файла (положите его в src/test/resources/tasks.json)
        File jsonFile = new File("src/test/resources/api-response.json");

        // Извлекаем TaskId первого элемента массива
        String firstTaskId = JsonPath.read(jsonFile, "$[0].TaskId");

        System.out.println("Первый TaskId: " + firstTaskId);
    }


}
