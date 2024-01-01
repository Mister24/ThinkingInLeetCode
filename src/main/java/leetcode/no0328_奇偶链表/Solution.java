package leetcode.no0328_奇偶链表;

import java.io.File;

class Solution {
    
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre.next;
        ListNode fast = pre.next.next;
        //        ListNode slow = head;
        //        ListNode fast = head;
        //        while (slow != null) {
        //            head.next =
        //        }
        
        return head;
        
    }
    
    private static void renameFile(File file) {
        String fileName = file.getName();
        int index = fileName.indexOf('_');
        String prefix = fileName.substring(0, index);
        String suffix = fileName.substring(index);
        //System.out.println(prefix);
        if (prefix.substring(prefix.indexOf("no") + 2).length() ==2) {
            prefix = "no00" + prefix.substring(prefix.indexOf("no") + 2);
        } else if (prefix.substring(prefix.indexOf("no") + 2).length() ==3) {
            prefix = "no0" + prefix.substring(prefix.indexOf("no") + 2);
        }
        String fullName = prefix + suffix;
        System.out.println(fullName);
              //  String newFileName = "新文件名" + extension; // 设置新文件名规则
        //
                File newFile = new File(file.getParent(), fullName);
                boolean isSuccessful = file.renameTo(newFile);
        //
                if (isSuccessful) {
                    System.out.println("成功将文件 " + fileName + " 重命名为 " + fullName);
                } else {
                    System.out.println("无法重命名文件 " + fileName);
                }
    }
    
    
    public static void main(String[] args) {
        String path = "/Users/mr.24/antFin/codeTrunk/ThinkingInLeetCode/src/main/java/leetcode";
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            System.out.println(files.length);
//            for (int i = 0; i < files.length; i++) {
//                //                if (files[i].isFile()) {
//                try {
//                    renameFile(files[i]);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                //                }
//            }
        }
    }
}