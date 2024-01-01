package leetcode.no0824_山羊拉丁文;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
    
    public static String toGoatLatin(String sentence) {
        if (null == sentence) {
            return null;
        }
        
        String[] strings = sentence.split(" ");
    
        String res = "";
        for (int i = 0; i < strings.length; i++) {
            res += process(strings[i]);
            for (int j = 0; j < i+1; j++) {
                res += "a";
            }
            
            res += " ";
        }
        
        res.substring(0, res.length()-1);
        
        return res;
    }
    
    static String process(String string) {
        if ("aeiouAEIOU".indexOf(string.charAt(0))>=0) {
            string = string + "ma";
        } else {
            char ch = string.charAt(0);
            string = string.substring(1) + ch + "ma";
        }
        
        return string;
    }
}