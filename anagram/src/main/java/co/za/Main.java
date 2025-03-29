package co.za;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean isAnagram = isAnagram(s, t);

        System.out.println(isAnagram);
    }

    /***
     * Given two strings s and t, returns true if they consist of exactly the same letters (number of letters is the same)
     * */
    private static boolean isAnagram(String s, String t){

        if(s.length() != t.length())
            return false;

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }

        return true;
    }
}