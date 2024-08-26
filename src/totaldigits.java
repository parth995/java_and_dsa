public class totaldigits {

    static int counter;
    public static int numberOfDigits(int n){
        if(n<=0){
            return 0;
        }
        return 1 + numberOfDigits(n/10);
    }

    public static void main(String[] args){
        System.out.println(numberOfDigits(12355));
    }
}
