package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLs {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));

        cars.set(0, "Opel");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars);
    }
}
