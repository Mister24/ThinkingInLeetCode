package leetcode.no2352_相等行列对;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        //        ints[0][0] = 1;ints[0][1] = 1;
        //        ints[1][0] = 2;ints[1][1] = 3;
        //        ints[2][0] = 3;ints[2][1] = 2;
        ints[0][0] = 3;
        ints[0][1] = 2;
        ints[0][2] = 1;
        ints[1][0] = 1;
        ints[1][1] = 7;
        ints[1][2] = 6;
        ints[2][0] = 2;
        ints[2][1] = 7;
        ints[2][2] = 7;
        System.out.println(equalPairs(ints));
    }
    
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int i = grid.length;
        int j = grid[0].length;
        Map<Integer, int[]> map = new HashMap<>();
        for (int k = 0; k < i; k++) {
            int[] ints = new int[j];
            for (int l = 0; l < j; l++) {
                ints[l] = grid[k][l];
                map.put(k, ints);
            }
        }
        
        for (int k = 0; k < j; k++) {
            int[] ints = new int[j];
            for (int l = 0; l < i; l++) {
                ints[l] = grid[l][k];
            }
            for (int m = 0; m < map.size(); m++) {
                if (Arrays.toString(map.get(m)).equals(Arrays.toString(ints))) {
                    count++;
                }
            }
        }
        
        return count;
    }
}