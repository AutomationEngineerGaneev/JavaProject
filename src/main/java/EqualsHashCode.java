public class EqualsHashCode {
    int varA;
    int varB;

    EqualsHashCode(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public static void main(String[] args) {
        EqualsHashCode object1 = new EqualsHashCode(5, 10);
        EqualsHashCode object2 = new EqualsHashCode(5, 10);
        System.out.println(object1.equals(object2));// должно быть true
        int hCode;
        int hCode1;
        hCode = object1.hashCode();
        hCode1 = object2.hashCode();
        System.out.println(hCode);
        System.out.println(hCode1);


        EqualsHashCode object3 = new EqualsHashCode(5, 10);
        EqualsHashCode object4 = object3;// Переменная object4 ссылается на тот-же объект что и переменная object3
        System.out.println(object3.equals(object4));// будет true
    }

//    public static void main(String[] args) {
//        Object object = new Object();
//        int hCode;
//        hCode = object.hashCode();
//        System.out.println(hCode);
//    }
    //Xеш-код — это число.

}
