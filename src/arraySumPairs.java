// calculate sum of first and last, second and second last, third and third last

import java.util.ArrayList;

public class arraySumPairs {

    public static ArrayList<Integer> sumPairs(int[] a){
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0, high = a.length-1;
        while(low <= high){
            ans.add(a[low] + a[high]);
            low++;
            high--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sumPairs(new int[]{1,2,3,9,6})); // 7 11 6
        System.out.println(sumPairs(new int[]{1,2,3,9,6,2})); // 3 8 12
    }
}
