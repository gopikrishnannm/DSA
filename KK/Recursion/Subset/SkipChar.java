package Recursion.Subset;

public class SkipChar {
    public static void main(String[] args) {
        //skip("","ababa", 'a');
        String ans = skipStringNotFull("abapplav", "app", "apple");
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
    public static String skipStringNotFull(String original, String skip, String full){
        if (original.equals("")){
            return "";
        }
        // if skip = app, full = apple then skip app only if original does not contain apple at the moment
        if (original.startsWith(skip) && !original.startsWith(full)){
            return skipStringNotFull(original.substring(skip.length()-1), skip, full);
        }
        else {
            return original.charAt(0) + skipStringNotFull(original.substring(1), skip, full);
        }
    }
}
