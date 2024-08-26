package accessmodifierstest;

import accessmodifiers.Student; // required as Student is class from different java package....

public class StudentChild extends Student {
    public void doSomething(){
        name = "Parth";
        // age = 10; # won't work as its default access modifiers
        psp = 100;
        // university = "abc"; # won't work as its private access modifiers


    }
}
