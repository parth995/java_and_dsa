package super_concept;

public class Animal{
    String name;

    public Animal(){
        System.out.println("Animal constructor called with no args....");
    }

    public Animal(String name){
        this.name = name;
        System.out.println("Animal named " +name+ " created");
    }
}
