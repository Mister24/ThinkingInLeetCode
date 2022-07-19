package leetcode.no497_非重叠矩形中的随机点;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println();
    }
    
    public Solution(int[][] rects) {
        // 用下标记录每个块包含的点数
        int[] pointCount = new int[rects.length];
        for (int i = 0; i < rects.length; i++) {
            pointCount[i] = (rects[i][3] - rects[i][1] + 1) * (rects[i][2] - rects[i][0] + 1);
        }

        // 先二分确认下下标落在哪个rect

        // 然后在rect内随机一个
    }
    
    /**
     *
     * @return
     */
    public int[] pick() {
        return null;
    }
}
