package collections;

import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void arraysExample() {

        List<String> immutable_list = List.of("apple", "banana", "orange");

        System.out.println(immutable_list);
        //        [apple, banana, orange]

        List<String> mutable_list = Arrays.asList("red", "green", "blue", null);

        System.out.println(mutable_list);

//        [red, green, blue, null]

    }

    public static void main(String[] args) {
        arraysExample();
    }
}
