package leetcode.no0819_最常见的单词;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

class Solution {
    
    public static void main(String[] args) {
        String[] banded = new String[2];
        banded[0] = "bob";
        banded[1] = "hit";
        System.out.println(mostCommonWord("Bob. hIt, baLl", banded));
    }
    
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String res="";
        for (int u = 0; u < paragraph.length(); u++) {
            if ("!?',;.".indexOf(paragraph.charAt(u)) >= 0) {
                res += " ";
            } else {
                res += paragraph.charAt(u);
            }
        }
        
        //        paragraph.replaceAll("!\\?',;\\.", " ");
        String[] strings = res.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.get(strings[i]) != null) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        
        map.remove("");
        
        for (int i = 0; i < banned.length; i++) {
            map.remove(banned[i]);
        }
        
        AtomicInteger max = new AtomicInteger();
        AtomicReference<String> key = new AtomicReference<>();
        map.entrySet().stream().forEach(t -> {
            if (t.getValue() > max.get()) {
                max.set(t.getValue());
                key.set(t.getKey());
            }
        });
        
        return key.get();
    }
}