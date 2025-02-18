package Day3;

public class pal {
    public static void main(String[] args) {
        System.out.println(rev1("maam"));
    }
    static boolean rev1(String st){
        int stringLength = st.length();
        for (int i = 0; i < stringLength/2; i++) {
            if (st.charAt(i) != st.charAt(stringLength-i-1)){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindrome(String str,int i) {
        if (i>=str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return isPalindrome(str, i+1);
    }
}
