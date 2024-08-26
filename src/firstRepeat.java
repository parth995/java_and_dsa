public class firstRepeat {

    public static int firstRepeat(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4,2,3,9,2,6,3};
        System.out.println(firstRepeat(a)); // 1 --> return index for 2
    }
}
