import java.util.Arrays;

public class findKthElement {

    public static int kthElementMin(int[] a, int k){
        Arrays.sort(a);
        return a[k-1];
    }

    public static int kthElementMax(int[] a, int k){
        Arrays.sort(a);
        return a[a.length-1];
    }

    public static void main(String[] args) {
        System.out.println(kthElementMin(new int[]{1,2,4,6,4,8,9}, 2));
        System.out.println(kthElementMax(new int[]{1,2,4,6,4,8,9}, 2));
    }
}
