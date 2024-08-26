public class tribonacci {

    public static int tri(int n){
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        return tri(n-1) + tri(n-2) + tri(n-3);
    }
    public static void main(String[] args){

        System.out.println(tri(5));
    }
}
