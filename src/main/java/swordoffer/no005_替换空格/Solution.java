package swordoffer.no005_替换空格;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    
    public static String replaceSpace(String s) {
        if (null == s) {
            return s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String prefix = s.substring(0, i);
                String suffix = s.substring(i + 1);
                s = prefix + "%20" + suffix;
            }
        }
        
        return s;
    }
    
    /**
     * 效率高
     *
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        if (null == s) {
            return s;
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}