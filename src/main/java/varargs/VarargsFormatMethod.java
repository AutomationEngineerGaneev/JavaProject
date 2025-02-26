package varargs;


//class Company {
public class VarargsFormatMethod {


//    public static String format(Locale l, String format, Object... args) {
//    // body
//}


    public static void main(String[] args) {
        String siteName = "programiz.com";
        int empCount = 6;
        String type = "tutorial website";
        System.out.println(
                String.format(
                        "Site Name : %s, Emp Count: %d Type: %s",
                        siteName, empCount, type
                )  //    Site Name : programiz.com, Emp Count: 6 Type: tutorial website
//                  %d - Задается целое число (int. byte, short, int, long, BigInteger)

//                %s  -

        );
    }

}
