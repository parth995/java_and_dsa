// combinations = n!

public class stringCombinations {

    public static void combinations(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i); // getting char from s
            String newStr = s.substring(0, i) + s.substring(i+1); // remove char ch from s
            combinations(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        combinations("abc", "");
    }
}
