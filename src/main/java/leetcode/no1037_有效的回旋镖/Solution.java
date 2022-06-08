package leetcode.no1037_有效的回旋镖;

public class Solution {
    public static void main(String[] args) {
        int[][] ints = new int[3][2];
//        ints[0][0] = 1;ints[0][1] = 1;
//        ints[1][0] = 2;ints[1][1] = 3;
//        ints[2][0] = 3;ints[2][1] = 2;
        ints[0][0] = 0;ints[0][1] = 2;
        ints[1][0] = 2;ints[1][1] = 1;
        ints[2][0] = 1;ints[2][1] = 1;
        System.out.println(ints.length);
        System.out.println(ints[1].length);
        System.out.println(isBoomerang(ints));
    }

    public static boolean isBoomerang(int[][] points) {
        // 如果任意2点重合
        if (points[0][0] == points[1][0] && points[0][1] == points[1][1] ||
                points[0][0] == points[2][0] && points[0][1] == points[2][1] ||
                points[1][0] == points[2][0] && points[1][1] == points[2][1]) {
            return false;
        }
        // 先处理竖直场景，没有斜率
        if (points[0][0] == points[1][0] && points[1][0] == points[2][0]) {
            return false;
        }

        // 任意2点在一个竖线上，另外一个点不要再有相同纵坐标
        if ((points[0][0] == points[1][0] && points[1][0] != points[2][0])
                || (points[0][0] == points[2][0] && points[1][0] != points[2][0])
                || (points[2][0] == points[1][0] && points[0][0] != points[2][0])) {
            return true;
        }

        return !(1.0 * (points[1][1] - points[0][1]) / (points[1][0] - points[0][0])
                == 1.0 * (points[2][1] - points[1][1]) / (points[2][0] - points[1][0]));
    }
}
