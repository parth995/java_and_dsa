import java.util.Arrays;

public class binarySearch {

    public static boolean binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;
        int mid;
        while(low <= high){

            mid = (low + high) / 2;

            if(key == a[mid]){
                return true;
            }
            else if(key < a[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {5,1,6,2,4,3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(binarySearch(a,2));
        System.out.println(binarySearch(a,7));
    }
}
