package greedy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P409LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if (freq.get(c) == null){
                freq.put(s.charAt(i), 1);
            }
            else {
                freq.put(c, freq.get(c) + 1);
            }
        }
        int res = 0;
        boolean hasOdd = false;
        for (Character key : freq.keySet()){
            int val = freq.get(key);
            if (val%2 == 0){
                res += val;
            }
            else {
                res += val - 1;
                hasOdd = true;
            }
        }
        res = hasOdd == true ? res + 1 : res;
        return res;
    }
    public static int longestPalindromeV2(String s) {
        int[] count = new int[128];
        int res = 0;
        for (int i=0; i<s.length(); i++){
            int character = s.charAt(i);
            count[character] += 1;
        }
        boolean hasOdd = false;
        for (int cnt : count){
            res += cnt - cnt%2;
            if (cnt%2 == 1){
                hasOdd = true;
            }
        }
        res = hasOdd ? res + 1 : res;
        return res;
    }
}