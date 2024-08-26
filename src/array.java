import java.util.Arrays;
import java.util.Scanner;

public class array {

    public class Student{
    }

    public static void main(String[] args) {
        array obj1 = new array();
        int[] obj2 = new int[3];
        int[][] obj3 = new int[2][3];
        boolean[] obj4 = new boolean[3];
        System.out.println(obj1); // <CLASS_NAME>@<ADDRESS>
        System.out.println(obj2); // [I@<ADDRESS>  --> for 1D array
        System.out.println(obj3); // [[I@<ADDRESS> --> for 2D array
        System.out.println(obj4); // [Z@<ADDRESS>  --> for boolean

        int[] a = new int[3];
        double[] d = new double[2];
        char[] c = new char[4];
        boolean[] b = new boolean[2];
        Student[] f = new Student[2];
        System.out.println(a); // it prints address reference only
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(f));

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of an array :- ");
        int n = obj.nextInt();
        int[] a2 = new int[n];

        System.out.println("Enter " +n+ " elements ....");
        for(int i = 0; i < n; i++){
            a2[i] = obj.nextInt();
        }

        System.out.println("Array elements using for loop....");
        for(int i = 0; i < n; i++){
            System.out.println("Index :- "+i+ "\t Element :"+ a2[i]);
        }

        System.out.println("Array elements using for each loop....");
        for(int item:a2){
            System.out.println("Element :"+ item);
        }

        System.out.println("Array elements using toString() method..." + Arrays.toString(a2));

    }
}
