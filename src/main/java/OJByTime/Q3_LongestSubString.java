package OJByTime;

import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest
 * substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 */
public class Q3_LongestSubString {
    public static void main(String []args){
        Q3_LongestSubString q3 = new Q3_LongestSubString();
        System.out.println(q3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(q3.lengthOfLongestSubstring("au"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        char[] str = s.toCharArray();
        int start = 0;
        int end = 0;
        int maxLen = 1;
        int len = s.length();
        boolean [] exists = new boolean[256];
        while (start < len - 1){
            while (end < len -1 && !exists[str[end]]) {
                exists[str[end]] = true;
                end++;
            }
            if (exists[str[end]]){
                resetExits(exists);
                maxLen = max(maxLen, end - start);
                start++;
            }
            end = start;
        }
        return maxLen;
    }

    private void resetExits(boolean [] exists){
        for (int i = 0; i < exists.length; i++){
            if (exists[i]) exists[i] = false;
        }
    }
    private int max(int a, int b){
        return a > b ? a : b;

    }
}
