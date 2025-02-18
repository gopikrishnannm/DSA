import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAllCharactersHash {
    public static void main(String[] args) {
        countWithsort("aabccddfd");
    }
    static void count(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }

        }
        for ( Map.Entry<Character, Integer> pair: map.entrySet()){
            System.out.println("key : "+ pair.getKey() + " freq : " + pair.getValue());
        }
    }
    // sorting according to values
    static void countWithsort(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }

        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Character, Integer> entry : entryList) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

}
