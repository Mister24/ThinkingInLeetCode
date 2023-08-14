package leetcode.no1456_定长子串中元音的最大数目;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }
    
    public static int maxVowels(String s, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                sum++;
            }
        }
        int max = sum;
        for (int i = k; i < s.length(); i++) {
//            if (!isVowel(s.charAt(i)) && !isVowel(s.charAt(i - k))) {
//            }
            if (!isVowel(s.charAt(i)) && isVowel(s.charAt(i - k))) {
                sum--;
                max = Math.max(max, sum);
            }
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i - k))) {
                sum += 1;
                max = Math.max(max, sum);
            }
//            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i - k))) {
//                sum += 1;
//            }
        }
        
        return max;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}