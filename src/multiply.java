public class multiply {

    static int counter;
    public static int mul(int a , int b){
        counter++;
        if(a < b){
            return mul(b,a);
        }
        else if(b!=0){
            return a + mul(a, b-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(mul(5,3) + "\t" + counter);
        System.out.println(mul(3,5) + "\t" + counter);
    }
}
