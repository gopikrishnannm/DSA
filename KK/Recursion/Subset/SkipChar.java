package Recursion.Subset;

public class SkipChar {
    public static void main(String[] args) {
        //skip("","ababa", 'a');
        String ans = skip2("ab", 'a');
        System.out.println(ans);
        System.out.println("a".substring(1));
        System.out.println("a");
    }
    public static void skip(String newOne, String original, Character character){
        if (original.isEmpty()){
            System.out.println(newOne);
            return;
        }
        char ch = original.charAt(0);
        if (ch == character){
            skip(newOne, original.substring(1), character);
        }
        else {
            skip(newOne+ ch, original.substring(1), character);
        }
    }
    public static String skip2(String original, Character character){
        if (original.equals("")){
            return "";
        }
        char ch = original.charAt(0);
        if (ch == character){
            return skip2(original.substring(1), character);
        }
        else {
            return ch+skip2(original.substring(1), character);
        }
    }
}
