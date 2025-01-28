package generics.robot;



//public class Robot {

// Начинается параметризация
// T - Type
public class Robot <T> {

//    Чтобы не создавать трёх разных роботов с разными головами мы будем использовать дженерики

//    private Body body;
//    private Head head;


    private Body body;
    private T head;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }


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
