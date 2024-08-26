// substrings = 2^n

public class substring {

    public static void subSets(String s, String ans, int index)
    {
        if(index == s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        subSets(s, ans+s.charAt(index), index+1); // include indexed character
        subSets(s, ans, index+1); // exclude indexed character
    }

    public static void main(String[] args) {
        subSets("abc", "", 0);
    }
}
