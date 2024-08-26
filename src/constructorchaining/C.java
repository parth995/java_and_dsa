package constructorchaining;

public class C extends B {
    public C(){ // We can't pass args here because class D needs non-args constructor when super() is called implicitly

        // adding super(); here is not required as java implicitly calls it
        // super(); // it is mandatory to have first statement only. It would work fine at this line but throw error after System.out.println()

        System.out.println("Calling from C");
    }
}
