package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("current date: " + today);

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
//        Следующий пример удалит и "T", и наносекунды из даты и времени:
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        yyyy-MM-dd	"1988-09-29"
//        dd/MM/yyyy	"29/09/1988"
//        dd-MMM-yyyy	"29-Sep-1988"
//        E, MMM dd yyyy	"Thu, Sep 29 1988"

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

//        LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
//        LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//        LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//        DateTimeFormatter	Formatter for displaying and parsing date-time objects
    }
}
