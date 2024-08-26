import java.util.Arrays;

public class maxArrayElement {

    public static int maxElementv1(int[] a){
        Arrays.sort(a); // sorts in ascending order
        return a[a.length-1];
    }

    public static int maxElementv2(int[] a){
        int ans = a[0];
        for(int i = 1; i < a.length; i++){
            ans = Math.max(ans, a[i]);
        }
        return ans;
    }

    public static int maxElementv3(int[] a, int index, int n){
        return (n==1)?a[index]:Math.max(a[index], maxElementv3(a, index+1, n-1));
    }

    public static int maxElementv4(int[] a){
        return Arrays.stream(a).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(maxElementv1(new int[]{1,2,3,9,6}));
        System.out.println(maxElementv2(new int[]{1,2,3,9,6}));
        System.out.println(maxElementv3(new int[]{1,2,3,9,6}, 0, 5));
        System.out.println(maxElementv4(new int[]{1,2,3,9,6}));
    }
}
