public class PalUsingRec {
    public static void main(String[] args) {
        String s = "mom";
        System.out.println(isPal(s, 0, s.length()-1));
    }
    static boolean isPal(String s, int i, int j){
        if (i>=j){
            return true;
        }
        if (s.charAt(i) != s.charAt(j)){
            return false;
        }
        return isPal(s, i+1, j-1);
    }
}
