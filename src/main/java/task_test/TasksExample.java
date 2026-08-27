package task_test;

import java.util.Arrays;

public class TasksExample {
    public static void main(String[] args) {
//        1
        String text = "яблоко,банан,груша,апельсин";
        String target = "груша";

        String found = Arrays.stream(text.split(","))
                .filter(s -> s.equals(target))
                .findFirst()
                .orElse(null);

        System.out.println(found);

//
//
//      2


        String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }


        String str1 = "Java";
        String str2 = "Hi";
        str2 = str2.concat(str1); // HiJava
        System.out.println(str2);


        String str_1 = "Java";
        String str_2 = "Hi";
        String str3 = String.join(" ", str_2, str_1); // Hi Java
        System.out.println(str3);

//        Удаление по регулярному выражению:Используйте метод replaceAll(String regex, String replacement), чтобы убрать всё, кроме букв и цифр.java
        String s = "123!_привет?";
        String res = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", ""); // результат: "123привет"
        System.out.println(res);


        String s1 = "123!_привет?";
        String res1 = s1.substring(6);
        String res2 = s1.substring(3, 5);
        String res3 = s1.substring(0, 5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }


//           Операции со строками и подстроками в Java
//Java → Полезное по Java SE
//Теги: java, строки, подстроки, поиск, методы, сравнение, операции со строками
//В этой статье мы рассмотрим операции со строкой и подстрокой. Вы узнаете, как соединять и сравнивать строки, как извлекать символы и подстроки, как выполнять поиск в строке.
//
//Соединение строк в Java
//Чтобы соединить строки в Java, подойдёт операция сложения "+":
//
//String str1 = "Java";
//String str2 = "Hi";
//String str3 = str1 + " " + str2;
//
//System.out.println(str3); // Hi Java
//
//Если же в предстоящей операции сложения строк будет применяться нестроковый объект, допустим, число, данный объект преобразуется к строке:
//
//String str3 = "Год " + 2020;
//
//По факту, когда мы складываем строки с нестроковыми объектами, вызывается метод valueOf() класса String. Этот метод преобразует к строке почти все типы данных. Чтобы преобразовать объекты разных классов, valueOf вызывает метод toString() данных классов.
//
//Объединять строки можно и с помощью concat():
//
//String str1 = "Java";
//String str2 = "Hi";
//str2 = str2.concat(str1); // HiJava
//
//Метод принимает строку, с которой нужно объединить вызывающую строку, возвращая нам уже соединённую строку.
//
//Также мы можем использовать метод join(), позволяющий объединять строки с учетом разделителя. Допустим, две строки выше слились в слово "HiJava", однако мы бы хотели разделить подстроки пробелом. Тут и пригодится join():
//
//String str1 = "Java";
//String str2 = "Hi";
//String str3 = String.join(" ", str2, str1); // Hi Java
//
//Метод join — статический. Первый параметр — это разделитель, который будет использоваться для разделения подстрок в общей строке. Последующие параметры осуществляют передачу через запятую произвольного набора объединяемых подстрок — в нашем случае их две, но можно и больше.
//
//Извлекаем символы и подстроки в Java
//Чтобы извлечь символы по индексу, в классе String есть метод char charAt(int index). Этот метод принимает индекс, по которому необходимо получить символы, возвращая извлеченный символ:
//
//String str = "Java";
//char c = str.charAt(2);
//System.out.println(c); // v
//
//Обратите внимание, что индексация начинается с нуля, впрочем, как и в массивах.
//Если же нужно извлечь сразу группу символов либо подстроку, подойдёт getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin). Этот метод принимает ряд параметров:
//•   srcBegin: индекс в нашей строке, с которого осуществляется начало извлечения символов;
//•   srcEnd: индекс в нашей строке, до которого осуществляется извлечение символов;
//•   dst: массив символов (именно в него будут эти символы извлекаться);
//•   dstBegin: индекс в массиве dst (с него надо добавлять символы, извлечённые из строки).
//
//String str = "Hi world!";
//int start = 6;
//int end = 11;
//char[] dst=new char[end - start];
//str.getChars(start, end, dst, 0);
//System.out.println(dst); // world
//
//Сравниваем строки в Java
//Мы уже писали о том, как сравнивать строки в Java, используя для этого метод equals() (регистр учитывается) и equalsIgnoreCase() (регистр не учитывается). Хотелось бы сказать пару слов про ещё одну пару методов: int compareTo(String str) и int compareToIgnoreCase(String str) — они позволяют не только сравнить 2 строки, но и узнать, больше ли одна другой. Если значение, которое возвращается, больше 0, первая строка больше, если меньше нуля, всё наоборот. Когда обе строки равны, вернётся ноль.
//
//Для определения используется лексикографический порядок. Допустим, строка "A" меньше строки "B", ведь символ 'A' в алфавите находится перед символом 'B'. Когда первые символы строк равны, в расчёт берутся следующие символы. К примеру:
//
//String str1 = "hello";
//String str2 = "world";
//String str3 = "hell";
//
//System.out.println(str1.compareTo(str2)); // -15 - str1 меньше, чем strt2
//System.out.println(str1.compareTo(str3)); // 1 - str1 больше, чем str3
//
//Поиск в строке в Java
//Чтобы найти индекс первого вхождения подстроки в строку, используют метод indexOf(), последнего — метод lastIndexOf(). Если подстрока не найдена, оба метода вернут -1:
//
//String str = "Hello world";
//int index1 = str.indexOf('l'); // 2
//int index2 = str.indexOf("wo"); //6
//int index3 = str.lastIndexOf('l'); //9
//
//Чтобы определить, начинается строка с определённой подстроки, применяют метод startsWith(). Что касается метода endsWith(), то он даёт возможность определить оканчивается ли строка на определенную подстроку:
//
//String str = "myfile.exe";
//boolean start = str.startsWith("my"); //true
//boolean end = str.endsWith("exe"); //true
//
//Выполняем замену в строке в Java
//Заменить в нашей строке одну последовательность символов другой можно с помощью метода replace():
//
//String str = "Hello world";
//String replStr1 = str.replace('l', 'd'); // Heddo wordd
//String replStr2 = str.replace("Hello", "Bye"); // Bye world
//
//Обрезаем строки в Java
//Для удаления начальных и конечных пробелов применяют метод trim():
//
//String str = "  hello world  ";
//str = str.trim(); // hello world
//
//Также существует метод substring() — он возвращает подстроку, делая это с какого-нибудь конкретного индекса до конца либо до определённого индекса:
//
//String str = "Hello world";
//String substr1 = str.substring(6); // world
//String substr2 = str.substring(3,5); //lo
//
//Меняем регистр в Java
//При необходимости вы можете перевести все символы вашей строки в нижний регистр (toLowerCase()) или в верхний (toUpperCase()):
//
//String str = "Hello World";
//System.out.println(str.toLowerCase()); // hello world
//System.out.println(str.toUpperCase()); // HELLO WORLD
//
//Split
//С помощью этого метода вы сможете разбить строку на подстроки по конкретному разделителю. Под разделителем понимается какой-либо символ либо набор символов, передаваемые в метод в качестве параметра. Давайте для примера разобьём небольшой текст на отдельные слова:
//
//String text = "OTUS is a good company";
//String[] words = text.split(" ");
//for(String word : words){
//    System.out.println(word);
//}
//
//В нашем случае строка разделится по пробелу, и мы получим следующий консольный вывод:
//
//OTUS
//is
//a
//good
//company
}
