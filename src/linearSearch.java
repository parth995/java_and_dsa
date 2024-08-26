import java.util.Arrays;

public class linearSearch {

    public static boolean linearSearch(int[] a, int key){
        for(int i = 0; i < a.length; i++){
            if(a[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {6,7,1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println(linearSearch(a,20));
        System.out.println(linearSearch(a,7));
    }
}
