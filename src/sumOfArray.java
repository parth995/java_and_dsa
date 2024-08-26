public class sumOfArray {

    public static int sumOfArray(int[] a){
        int s = 0;
        for(int item:a)
            s += item;
        return s;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(sumOfArray(a));
        System.out.println(sumOfArray(new int[]{10,20,30})); // nameless arrays
    }
}
