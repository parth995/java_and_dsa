package constructorchaining;

public class D extends C {
    public D(){
        // adding super(); here is not required as java implicitly calls it
        // super(); // it is mandatory to have first statement only. It would work fine at this line but throw error after System.out.println()
        System.out.println("Calling from D");
    }
}
