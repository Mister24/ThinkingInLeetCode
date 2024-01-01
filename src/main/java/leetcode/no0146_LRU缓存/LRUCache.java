//package leetcode.no0146_LRU缓存;
//
//class LRUCache {
//
//    public LRUCache(int capacity) {
//
//    }
//
//    public int get(int key) {
//
//    }
//
//    public void put(int key, int value) {
//
//    }
//
//    class Node {
//        public int key;
//        public int value;
//        public Node prev;
//        public Node next;
//
//        public Node(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    class DoubleList {
//        private Node dummyHead;
//        private Node dummyTail;
//        private int size;
//
//        public DoubleList() {
//            dummyHead = new Node(0,0);
//            dummyTail = new Node(0,0);
//            dummyHead.next = dummyTail;
//            dummyTail.prev = dummyHead;
//            size = 0;
//        }
//
//        // 在weu'vy
//    }
//}
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */