package enums;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// create the enum
public enum WEEKDAY {

    // create values of enum
    MONDAY("Day 1"),
    TUESDAY("Day 2"),
    WEDNESDAY("Day 3"),
    THURSDAY("Day 4"),
    FRIDAY("Day 5"),
    SATURDAY("Day 6"),
    SUNDAY("Day 7");

    private final String description;
    // private constructor to set default value
    private WEEKDAY(String description) {
        this.description = description;
    }
    // getter method to get the description
    public String getDescription () {
        return this.description;
    }

//    private String getCurrentDay() {
//        DayOfWeek dow = LocalDate.now().getDayOfWeek();
//
//        Locale ru = new Locale("ru", "RU");
//
//        System.out.println(dow.getDisplayName(TextStyle.FULL, ru));
//
//        return dow.getDisplayName(TextStyle.FULL, ru);
//    }

    public static void main(String[] args) {
//        System.out.println(WEEKDAY.MONDAY.getDescription());
//        System.out.println(WEEKDAY.MONDAY);
//        DayOfWeek dow = LocalDate.now().getDayOfWeek();
//        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM", Locale.getDefault());
//        Locale ru = new Locale("ru", "RU");

//        System.out.println(dow.getDisplayName(TextStyle.FULL, ru));
//        System.out.println(String.format(new SimpleDateFormat("EEEE").format(new Date()),"%tA"));
//        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE")));
//        System.out.println(String.format("Сегодня %tA",new Date()));


//        String dayCurrent = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE"));
//        String dayCurrentUpper = dayCurrent.substring(0, 1).toUpperCase() + dayCurrent.substring(1);
//        System.out.println(dayCurrentUpper);


//        String word = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE"));
//        String newWord = word.substring(0, 1).toUpperCase() + word.substring(1);
//        System.out.println(word); // => hello
//        System.out.println(newWord); // => Hello


//        LocalDateTime dateCurrent = LocalDateTime.now();
//        System.out.println(dateCurrent);

//        LocalDateTime dateCurrent = LocalDateTime.now();
//        int day = dateCurrent.getDayOfMonth();
//        String dayCorrect = Integer.toString(day);
//        System.out.println(dayCorrect);

        // Получаем дату
//        LocalDateTime date = LocalDateTime.now();
        // Например, 15 июля 2024

// Получаем номер квартала
//        int quarter = (date.getMonthValue() - 1) / 3 + 1;
//        System.out.println("Квартал (число): " + quarter); // Вывод: 3

// Или через ChronoField
//        int quarterField = date.get(ChronoField.);
//        System.out.println("Квартал (ChronoField): " + quarterField); // Вывод: 3


//        YearQuarter yearQuarter = YearQuarter.from(date);
//
//        int quarterNumber = yearQuarter.getQuarter();
//        System.out.println("Номер квартала: " + quarterNumber); // Вывод: 4

//        LocalDate myLocal = LocalDate.now();
//        int quarter = myLocal.get(IsoFields.QUARTER_OF_YEAR);
//        System.out.println("Номер квартала: " + quarter);


//        LocalDate myLocal = LocalDate.now();
//        int month = myLocal.getMonthValue(); // 8 (август)
//        int monthInQuarter = (month - 1) % 3 + 1; // (8 - 1) % 3 + 1 = 7 % 3 + 1 = 1 + 1 = 2 (второй месяц в квартале)
//
//        System.out.println("Номер месяца в квартале: " + monthInQuarter);

//        LocalDateTime now = LocalDateTime.now();
//        // Используем Locale для форматирования
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("ru", "RU"));
//        String dayCurrent = now.format(formatter);
//        System.out.println(dayCurrent);
//        String dayCurrentUpper = dayCurrent.substring(0, 1).toUpperCase() + dayCurrent.substring(1);
//        System.out.println("Текущий день недели: " + dayCurrentUpper);

        LocalDateTime date = LocalDateTime.now().plusDays(Integer.parseInt("1"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", new Locale("ru", "RU"));
        String dayCurrent = date.format(formatter);
        System.out.println(dayCurrent);
        String dayUpper = dayCurrent.substring(0, 1).toUpperCase() + dayCurrent.substring(1);
        System.out.println("День недели: " + dayUpper);
    }
}