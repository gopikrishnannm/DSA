public class CountAllCharacterBrute {
    public static void main(String[] args) {
        count("abccda");
    }
    
    static void count(String str){
        boolean isCounted[] = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // by default false for all elements
            if (!isCounted[i]){
                int count = 1;
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)){
                        count++;
                        isCounted[j] = true;
                    }
                }
                System.out.println("count of "+str.charAt(i) + "is "+count);
            }



        }

    }
    /*
      why we need boolean array
      to avoid duplicate
     */
}
