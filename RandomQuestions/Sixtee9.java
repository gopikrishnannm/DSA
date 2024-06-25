public class Sixtee9 {
    public static void main(String[] args) {
        int n = 9669;
        char[] arr = Integer.toString(n).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }
        System.out.println(Integer.parseInt(new String(arr)));
    }
}
