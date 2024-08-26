public class sumOfPrimeElements {

    static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimeElements(int[] a){
        int s = 0;
        for(int item:a){
            if(isPrime(item)){
                s += item;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimeElements(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
