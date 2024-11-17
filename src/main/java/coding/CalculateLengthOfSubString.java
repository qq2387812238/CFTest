package coding;

import java.util.HashSet;

/**
 * 第三题：无重复字符的最长子串
 */
public class CalculateLengthOfSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        CalculateLengthOfSubString calculateLengthOfSubString = new CalculateLengthOfSubString();
        int i = calculateLengthOfSubString.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    int lengthOfLongestSubstring(String s){
        int maxLen = 0;
        // 存储字符, 用于判断是否重复
        HashSet<Character> characters = new HashSet<>();
        for (int start = 0; start < s.length(); start++){
            // 判断是否重复
            if (characters.contains(s.charAt(start))){
                // 判断是否是最长子串
                if (maxLen < characters.size()){
                    // 更新最长子串长度
                    maxLen = characters.size();
                }
                // 清空
                characters.clear();
            }
            // 将字符加入到集合中
            characters.add(s.charAt(start));
        }
        return maxLen;
    }
}
