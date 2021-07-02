public class Constructors {
    int modelYear;
    String modelName;

//    public Constructors1(int year, String name) {
//        modelYear = year;
//        modelName = name;
//    }

    public Constructors(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }


}
