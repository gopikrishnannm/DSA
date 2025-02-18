import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "imp";
        String s2 = "mip";
        isAn(s1, s2);
    }
    static void isAn(String s1, String s2){

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)){
            
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
