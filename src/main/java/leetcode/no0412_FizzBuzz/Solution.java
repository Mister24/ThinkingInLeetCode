package leetcode.no0412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int data = i + 1;
            if (data % 3 == 0 && data % 5 == 0) {
                list.add("FizzBuzz");
            } else if (data % 3 == 0) {
                list.add("Fizz");
            } else if (data % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(data));
            }
        }
        
        return list;
    }
}