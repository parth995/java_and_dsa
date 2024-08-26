package constructorchaining;

public class B extends A {
    public B(){
        // adding super(); here is not required as java implicitly calls it
        // super(); // it is mandatory to have first statement only. It would work fine at this line but throw error after System.out.println()
        System.out.println("Calling from B");
    }
}
