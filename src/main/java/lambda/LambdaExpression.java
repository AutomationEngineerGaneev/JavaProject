package lambda;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaExpression {

    // Они представляют собой сокращенный синтаксис для представления объектов,
    // реализующих функциональные интерфейсы, и позволяют писать более компактный и выразительный код.


    // Функциональные интерфейсы
    // Функциональный интерфейс — это интерфейс с одним абстрактным методом.
    // Java 8 включает также механизм default методов, которые позволяют добавлять реализацию методов в интерфейсы,
    // но функциональный интерфейс должен содержать только один абстрактный метод. Пример функционального интерфейса:

    @FunctionalInterface
    public interface MyFunction {
        int apply(int x);
    }


    public int lambdaMethod() {
        MyFunction square = x -> x * x;
        int result = square.apply(4);// Результат: 16
        return result;
    }


    //    Отфильтровали четные числа
    public List<Integer> lambdaMethodWithList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        return evenNumbers;
    }


//    Метод Stream filter() для фильтрации Map по ключам и значениям.
    public Map<Integer, String> lambdaMethodWithMapByKeys() {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");

        Map<Integer,String> result = hmap.entrySet().stream()
                .filter(map -> map.getKey().intValue() <=22)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

//        System.out.println("Result: " + result);
        return result;
    }

    public Map<Integer, String> lambdaMethodWithMapByValues() {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

//        System.out.println("Result: " + result);
        return result;
    }

    public Map<Integer, String> lambdaMethodWithMapByBothKeyAndValue () {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "ABC");
        hmap.put(2, "XCB");
        hmap.put(3, "ABB");
        hmap.put(4, "ZIO");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(p -> p.getKey().intValue() <= 2) //filter by key
                .filter(map -> map.getValue().startsWith("A")) //filter by value
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

//        System.out.println("Result: " + result);
        return result;
    }




    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        LambdaExpression lambdaExpression = new LambdaExpression();

        System.out.println("1." + " " + lambdaExpression.lambdaMethod());
        System.out.println("2." + " " + lambdaExpression.lambdaMethodWithList());
        System.out.println("3." + " " + lambdaExpression.lambdaMethodWithMapByKeys());
        System.out.println("4." + " " + lambdaExpression.lambdaMethodWithMapByValues());
        System.out.println("5." + " " + lambdaExpression.lambdaMethodWithMapByBothKeyAndValue());
    }
}
