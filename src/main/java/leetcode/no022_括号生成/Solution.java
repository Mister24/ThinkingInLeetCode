/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */

package leetcode.no022_括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/12/25 4:34 下午 Exp $$
 */
public class Solution {
    
    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(2));
        System.out.println(generateParenthesis(3));
    }
    
    static List<String> DATA = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        DATA.clear();
        dfs(n, 0, 0, "");
        return DATA;
        
    }
    
    public static void dfs(int n, int lc, int rc, String str) {
        if (lc == n || rc == n) {
            DATA.add(str);
            return;
        } else {
            if (lc < n) {
                dfs(n, lc + 1, rc, str + "(");
            }
            
            if (rc < n && lc > rc) {
                dfs(n, lc, rc + 1, str + ")");
            }
        }
    }
    
    
}
