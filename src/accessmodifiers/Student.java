package accessmodifiers;

public class Student {

    public String name;
    int age;
    protected double psp;
    private String university;

    public void doSomething(){
        name = "asdff";
        age = 10;
        psp = 1.0;
        university = "abc";

        Student st = new Student();
        st.name = "abc";
        st.age = 10;
        st.psp = 100.0;
        st.university = "xyz";
    }
}