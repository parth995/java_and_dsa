public class towersofhanoi {

    public static void towers(int n, String src, String temp, String dest) {
        if(n == 1){
            System.out.println("move disk " +n+ " from " +src+ " to " +dest);
            return;
        }
        towers(n-1, src, dest, temp);
        System.out.println("move disk " +n+ " from " +src+ " to " +dest);
        towers(n-1, temp, src, dest);
    }

    public static void main(String[] args){
        towers(2, "Src", "Temp", "Dest");
        System.out.println("----------------------");
        towers(3, "Src", "Temp", "Dest");
    }
}
