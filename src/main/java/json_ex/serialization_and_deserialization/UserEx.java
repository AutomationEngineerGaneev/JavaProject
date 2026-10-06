package json_ex.serialization_and_deserialization;


public class UserEx {

    private String name;
    private int age;

    // Пустой конструктор нужен для десериализации
    public UserEx() {
    }

    public UserEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
