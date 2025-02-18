import java.util.Arrays;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String s = "this is a sample";
        rev(s);
    }
    static void rev(String str){
        String[] array = str.split(" ");
        //System.out.println(Arrays.toString(sa));
        String result = "";
        for(String s : array){
            result = result +" "  + rotate(s);
        }
        System.out.println(result);
    }
    static String rotate(String str){
        String res = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }

}
