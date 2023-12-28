package leetcode.no735_小行星碰撞;

import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[] {5, 10, -5};
        int[] int1 = asteroidCollision(ints);
        for (int i = 0; i < int1.length; i++) {
            System.out.println(int1[i]);
        }
    }
    
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
                continue;
            }
            if (stack.peek() * asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            } else if (stack.peek() * asteroids[i] < 0 && Math.abs(stack.peek()) == Math.abs(asteroids[i])) {
                stack.pop();
                continue;
            } else if (stack.peek() * asteroids[i] < 0 && Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
                stack.pop();
                stack.push(asteroids[i]);
                continue;
            } else if (stack.peek() * asteroids[i] < 0 && Math.abs(stack.peek()) > Math.abs(asteroids[i])) {
                //
            }
        }
        
        int[] ints = new int[stack.size()];
        if (stack.size() != 0) {
            for (int j = 0; j < ints.length; j++) {
                ints[ints.length - j - 1] = stack.pop();
            }
            
        }
        
        return ints;
    }
}