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

    public static void main(String[] args) {

        StreamAPIExample streamAPIExample = new StreamAPIExample();

        System.out.println(streamAPIExample.getSort());
    }
}
