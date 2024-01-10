package leetcode.no374_猜数字大小;

public class Solution {}


// 注释的内容为正确解，避免不存在的类和方法影响，注释掉。
//public class Solution extends GuessGame {
//
//    public int guessNumber(int n) {
//        int left = 0, right = n;
//        while (left < right) {
//            //            int middle = (left + right) << 1;
//            int middle = left + (right - left) /2;
//            if (guess(middle) == 0) {
//                right = middle;
//            } else if (guess(middle) < 0) {
//                right = middle;
//            } else if (guess(middle) > 0) {
//                left = middle+1;
//            }
//        }
//
//        return right;
//    }
//}