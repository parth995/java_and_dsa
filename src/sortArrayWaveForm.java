// 10 11 12 13 14 15 16 ---> 11 10 13 12 15 14 16

import java.util.Arrays;

public class sortArrayWaveForm {

    public static void swap(int[] a, int index1, int index2){
        int temp;
        temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void sortArrayWaveForm(int[] a){
        Arrays.sort(a);
        for(int i = 0; i < a.length-1; i+=2){
            swap(a, i, i+1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10,11,12,13,14,15,16,17};
        System.out.println(Arrays.toString(a));
        sortArrayWaveForm(a);
        System.out.println(Arrays.toString(a));
    }
}
