public class Reverse {
    public static void main(String[] args) {

    rev("gknm");

    }

    static void rev(String s){
        String n = "";
        for (int i = s.length()-1; i >= 0; i--) {
            n = n + s.charAt(i);
        }
        System.out.println(n);
    }

}
