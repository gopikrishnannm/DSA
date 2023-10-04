package Recursion.Permutations;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permu("","abc");

        ArrayList<String> ans = permuList("","abc");

        System.out.println(ans);
    }
    static void permu(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permu(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permuList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permuList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
