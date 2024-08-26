package super_concept;

public class Dog extends Animal{

    String breed;

    public Dog(String name, String breed){
        super(name); // will call parameterized constructor public Animal(String name) and not default public Animal()
        this.breed = breed;
        System.out.println("Dog of breed " +breed+ " created");
    }
}