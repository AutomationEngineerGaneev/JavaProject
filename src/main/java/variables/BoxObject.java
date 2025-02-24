package variables;

public class BoxObject {

    private Object obj;

    public BoxObject(Object o) {
        obj = o;
    }

    public Object get() {
        return obj;
    }

    public static void main(String[] args) {
//Тест 1 - get() возвращает Object
//        BoxObject box = new BoxObject("Hello!");
//        int len = box.get().length();
//        error: cannot find symbol
//        symbol:   method length()
//        location: class Object

//Тест 2 - несовместимые типы
//        BoxObject boxObject = new BoxObject("Hello!");
//        String o = boxObject.get();
//        int len = o.length();

//        error: incompatible types: Object
//        cannot be converted to String
//        String o = box.get(); ^

//Тест 3 - успешная компиляция
        BoxObject boxObject1 = new BoxObject("Hello!");
        String o1 = (String) boxObject1.get();
        int len1 = o1.length();
        System.out.println(len1);

//Тест 3 - исключение приведения типа
//        BoxObject boxObject2 = new BoxObject(256);
//        String o2 = (String) boxObject2.get();
//        int len2 = o2.length();
//        System.out.println(len2);

//        Exception in thread "main" java.lang.ClassCastException:
//class java.lang.Integer cannot be cast to class java.lang.String

    }

}
