package collections;

import java.util.HashMap;

//    интерфейс Map не относят к коллекции.
//    в коллекции элемент данных представляет определенный Object,
//    то в реализации Map элемент является совокупностью пары "ключ-значение".
public class HashMp {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, Integer> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", 1);
        capitalCities.put("Germany", 2);
        capitalCities.put("Norway", 3);
        capitalCities.put("USA", 4);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        capitalCities.clear();
        System.out.println(capitalCities);

    }
//    HashMap	порядок элементов рассчитывается по hash ключу;
//    TreeMap	элементы хранятся в отсортированном порядке;
//    LinkedHashMap	элементы хранятся в порядке вставки.
}
