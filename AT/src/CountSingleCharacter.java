public class CountSingleCharacter {
    public static void main(String[] args) {
        String s = "roman reigns";
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                c++;
            }
        }
        System.out.println(c);
    }
}
