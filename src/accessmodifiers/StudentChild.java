package accessmodifiers;

public class StudentChild extends Student{
    public void doSomething(){
        Student st = new Student();
        st.name = "parth...";
        st.age = 28;
        st.psp = 80;
        // st.university = "PU"; # cant access as its private
    }
}
