package accessmodifiers;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "parth";
        st.age = 28;
        st.psp = 50.0;
        // st.university = "Parul"; # cant access as its private

    }
}
