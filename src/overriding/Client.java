package overriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("asdfasdf");

        B b = new B();
        b.doSomething("asdfasdf");

        A a1 = new B();
        a1.doSomething("asdasd");

        A obj = new C();
        obj.doSomething("asdasd");
    }
}
