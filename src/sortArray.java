import java.util.Arrays;

public class sortArray {

    public static void sortAsc(int[] a){
        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,1,0,6,2,4,3};
        System.out.println(Arrays.toString(a));
        sortAsc(a);
        System.out.println(Arrays.toString(a));
    }
}
