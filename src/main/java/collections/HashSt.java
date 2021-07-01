package collections;

import java.util.HashSet;

public class HashSt {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");//BMW добавлен дважды, он появляется в наборе только один раз,
        // потому что каждый элемент в наборе должен быть уникальным.
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        cars.remove("Volvo");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

    }
}
