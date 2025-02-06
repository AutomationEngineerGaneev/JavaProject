package generics.robot;

//public class Robot {

// Начинается параметризация
// T - Type
//public class Robot <T> {

// Мы можем сейчас использовать только те классы, которые наследуются от Head

public class Robot <T extends Head> {

//Параметризованные методы могут быть без параметризованных классов
//public class Robot {

//    Чтобы не создавать трёх разных роботов с разными головами мы будем использовать дженерики

//    private Body body;
//    private Head head;


//    private Body body;
//    private T head;
//    private SmallHead head;
//    private Object head;

//в этом случае public class Robot <T extends Head> {
    private Body body;
    private T head;

//    public void foo() {
//        с переменной данного типа мы не можем работать
// методы класса object.
//        head.
//    }



//    Параметризованные методы
//    Эти параметры T1 и Т2 могут использоваться либо внутри самого метода,
//    либо в качестве принимаемых методом параметров, то есть мы можем
//    написать здесь int а, int b и сложить эти числа.
//    public <T1,T2> void foo(int a, int b) {
//
//    }

//    public <T1,T2> T2 foo(int a, int b) {
//        Данные с параметром T1 к примеру это будет leg, тип лек тоже,
//        но суть в том, что объект данного класса мы создать не можем;
//        T1 leg = new T1();

//    }


//    public <T1,T2> T2 foo(T1 a, T2 b) {
//        Единственное, что мы можем воспользоваться методами класса Object
//        потому что не известен какой тип

//        a.



//        Данные с параметром T1 к примеру это будет leg, тип лек тоже,
//        но суть в том, что объект данного класса мы создать не можем;
//        T1 leg = new T1();
//    }


//    public <T1,T2> T2 foo(T1 a, T2 b) {
//
//
//        return b;
//    }



//    Эти параметры могут быть как в параметрах метода
//    либо Просто внутри самого метода использоваться данные
//    объекты данных типов и всё и Т2 он возвращает
//    То есть тут на самом деле очень сложно придумать какой-то функционал
//    для параметризованных методов.
//    public <T1,T2> T2 foo(T1 a, T2 b) {
//
//
//        return b;
//    }

//        для этого случая robot5.<SmallHead, SmallHead>foo(smallHead,smallHead);
//    public <T1,T2 extends Head> T2 foo(T1 a, T2 b) {
//
//
//        return b;
//    }



//   в этом случае -> нужен вот такой класс public class Robot {
//    public <T1,T2 extends Head> T2 foo(T1 a, T2 b) {
//
//
//        return b;
//    }


//  В методе может использоваться с параметризацией знак вопроса
//  к примеру в данном методе робот у нас данная функция принимает объект нашего же класса,
//  но мы не знаем Какое именно,
//  то есть ставим вопросик и пишем к примеру,
//  это мы всё убираем и делаем к примеру Войд. Да но только нам Тут нужно опять
//  добавить параметризацию, то есть сделаем Т просто экстенс Head
//    public class Robot <T extends Head> {
    public void foo(Robot<?> ob) {


        return ;
    }


    //в этом случае public class Robot {
//    public Robot(Body body, SmallHead head) {
//        this.body = body;
//        this.head = head;
//    }

    //   public class Robot <T extends Head> в этом случае
//    public Robot(Body body, T head) {
//        this.body = body;
//        this.head = head;
//    }
//
//    public Body getBody() {
//        return body;
//    }
//
//    public void setBody(Body body) {
//        this.body = body;
//    }
//
//    public T getHead() {
//        return head;
//    }
//
//    public void setHead(T head) {
//        this.head = head;
//    }



    //   public class Robot в этом случае будет вот так
    //    public Robot(Body body, Head head) {
//        this.body = body;
//        this.head = head;
//    }
//
//    public Body getBody() {
//        return body;
//    }
//
//    public void setBody(Body body) {
//        this.body = body;
//    }
//
//    public Head getHead() {
//        return head;
//    }
//
//    public void setHead(Head head) {
//        this.head = head;
//    }
}
