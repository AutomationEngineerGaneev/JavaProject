package collections;

import java.util.Arrays;
import java.util.List;

public class ExampleItem {

    // Требуется реализовать отдельный метод notUnique(), который будет искать повторяющиеся слова в наборе слов.
// Аргумент метода и возвращаемое значение должно быть типа Collection.
// Слова изначально записаны в виде строки - требуется выполнить преобразование в коллекцию в методе main.
// Результат вывести на экран.

// Входные данные: "one two three four two five one nine three one"
// Результат: {one, two, three}

    public static void main (String[] args) {
        String line = "one two three four two five one nine three one";
        System.out.println(line);
        String[] a = line.split(" ");
        System.out.println(a);
        List<String> list  = Arrays.asList(a);
        System.out.println(list);
    }
}
