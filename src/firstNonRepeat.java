import java.util.HashMap;
import java.util.Map;

public class firstNonRepeat {

    public static int firstNonRepeat(int[] a){
        for(int i = 0; i < a.length; i++){
            int j;
            for(j = 0; j < a.length; j++){
                if(i !=j && a[i] == a[j]){
                    break;
                }
            }
            if(j == a.length)
                return a[i];
        }
        return -1;
    }

    public static int firstNonRepeatv2(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }
        for(int i = 0; i < a.length; i++){
            if(map.get(a[i]) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4,2,3,9,2,6,3,9,4};
        //System.out.println(firstNonRepeat(a)); // returns 6
        System.out.println(firstNonRepeatv2(a)); // returns 6
    }
}
