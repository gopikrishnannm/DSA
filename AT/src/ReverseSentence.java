public class ReverseSentence {
    public static void main(String[] args) {
        rev("i am not a                programmer");
    }
    static void rev(String s){
        String[] a = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = a.length-1; i >= 0; i--) {
            result.append(a[i]);
            if (i >= 1){
                result.append(" ");
            }

        }
        System.out.println(result);
    }
}
