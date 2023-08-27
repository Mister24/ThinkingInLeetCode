package leetcode.no1431_拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = max<candies[i] ? candies[i]:max;
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
    
        return result;
    
    }
}