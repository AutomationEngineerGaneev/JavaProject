package stream_api_base;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {

    //Этот метод используется для сортировки элементов стрима.
// По умолчанию применяется сортировка по возрастанию
// (с числами всё понятно, а вот заглавные и строчные буквы рассматриваются отдельно).
    public List getSort() {
        Library library = new Library();
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());

        return list;
    }

//    Stream API поддерживает множество типов источников данных.
//    Поток может быть создан из коллекций, массивов, строк, файлов и других структур.
//    Например:

    public long exampleStreams() {
        List<String> list = Arrays.asList("one", "two", "three");
        long streamFromList = list.stream().count();
//        В этом примере count() — терминальная операция, которая возвращает количество элементов в потоке.
        return streamFromList;
    }

    public List exampleStreams2() {
        final List<String> list = List.of("one", "two", "three");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
//                    filter() — фильтрует строки, длина которых меньше или равна 3 символам.
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                    //map() — преобразует оставшиеся строки в верхний регистр.

                })
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                    //forEach() — выводит каждый элемент на консоль.

                });

        return list;
    }

    public List<String> exampleStreams3() {
        final List<String> list = List.of("one", "two", "three");
        final List<String> list1 = Arrays.asList("one", "two", "three");

//        list.stream();
        list1.stream();
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.length() <= 3;
////                    filter() — фильтрует строки, длина которых меньше или равна 3 символам.
//                });
//                .map(s1 -> {
//                    System.out.println("map: " + s1);
//                    return s1.toUpperCase();
//                    //map() — преобразует оставшиеся строки в верхний регистр.
//
//                });
//                .forEach(x -> {
//                    System.out.println("forEach: " + x);
//                    //forEach() — выводит каждый элемент на консоль.
//
//                });

        return list1;
    }


    public static void main(String[] args) {

        StreamAPIExample streamAPIExample = new StreamAPIExample();

        System.out.println(streamAPIExample.getSort());
        System.out.println(streamAPIExample.exampleStreams());
//        System.out.println(streamAPIExample.exampleStreams2());
        System.out.println(streamAPIExample.exampleStreams3());

    }
}
