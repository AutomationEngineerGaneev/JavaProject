package replace;

public class UpdateStr {

    public static void main(String[] args) {
        String str = "Java123 - это456 язык программирования789.";

        // 1. Замена всех цифр на пустую строку (удаление цифр)
        String noDigits = str.replaceAll("\\d", "");
        System.out.println(noDigits); // "Java - это язык программирования."

        // 2. Замена слова
        String replacedWord = str.replaceAll("Java", "Kotlin");
        System.out.println(replacedWord); // "Kotlin123 - это456 язык программирования789."

        // 3. Замена слова
        String strSecond = "Неразрывный пробел-&nbsp;-штука необычная";

        String replacedWord1 = strSecond.replaceAll("&nbsp;", " ");
        String replacedWord2 = strSecond.replaceAll("&nbsp;", "");
        System.out.println(replacedWord1); // "Неразрывный пробел- -штука необычная"
        System.out.println(replacedWord2); // "Неразрывный пробел--штука необычная"

        String fieldValueFirst = "<br> 06.11.2020 в 21:43 после включения выключателей 330 кВ блочного трансформатора 2Т обнаружено отсутствие тока в фазе «С» на выключателе В-1 ГТ-2 и пропадание на АРМ телеизмерений тока фазы «С» с обоих выключателей.";
        String fieldValue = fieldValueFirst.trim().replaceAll("(?i)<br\\s*/?>", "");
            System.out.println("Field value: " + fieldValue);

        if(fieldValue.contains("06.11.2020 в")){
            System.out.println("Field value2: " + fieldValue);
        }
    }
}
