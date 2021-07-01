public class ToStr {
    private String fullName;
    private int age;
    private boolean retired;

    public ToStr(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }


    @Override
    public String toString() {
        return "ToStr{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", retired=" + retired +
                '}';
    }
    public static void main(String[] args) {
        ToStr toStr = new ToStr("Петров Артур Артурович", 56, false);
        System.out.println(toStr);
    }
}
