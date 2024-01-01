package leetcode.no2352_相等行列对;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public static void main(String[] args) {
        int[][] ints = { {3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2} };

        System.out.println(equalPairs(ints));
    }
    
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int i = grid.length;
        int j = grid[0].length;
        Map<String, Integer> map = new HashMap<>();
        for (int k = 0; k < i; k++) {
            int[] ints = new int[j];
            for (int l = 0; l < j; l++) {
                ints[l] = grid[k][l];
            }
            map.put(Arrays.toString(ints), map.getOrDefault(Arrays.toString(ints), 0) + 1);
        }
        
        for (int k = 0; k < j; k++) {
            int[] ints = new int[j];
            for (int l = 0; l < i; l++) {
                ints[l] = grid[l][k];
            }
            if (null != map.get(Arrays.toString(ints)) && map.get(Arrays.toString(ints)) > 0) {
                count+=map.get(Arrays.toString(ints));
            }
//            for (int m = 0; m < map.size(); m++) {
//                if (Arrays.toString(ints).equals(Arrays.toString(ints))) {
//                    count++;
//                }
//            }
        }
        
        return count;
    }
}