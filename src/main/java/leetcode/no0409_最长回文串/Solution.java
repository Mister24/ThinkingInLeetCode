package leetcode.no0409_最长回文串;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));;
    }
    
    public static int longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        s=s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                int num = map.get(s.charAt(i));
                map.put(s.charAt(i), num + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
    
        AtomicInteger maxSingle=new AtomicInteger();
        AtomicInteger sum = new AtomicInteger();
        map.entrySet().stream().forEach(
                item -> {
                    if (item.getValue()%2==0) {
                        sum.addAndGet(item.getValue());
                    } else {
                        if (maxSingle.get() < item.getValue()) {
                            maxSingle.set(item.getValue());
                        }
                    }
                }
        );
        
        return sum.addAndGet(maxSingle.get());
    }
}