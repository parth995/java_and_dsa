package constructorchaining;

public class A {
    public A(){
        // adding super(); here is not required as java implicitly calls it
        // super(); // it is mandatory to have first statement only. It would work fine at this line but throw error after System.out.println()
        System.out.println("Calling from A");
    }
}
