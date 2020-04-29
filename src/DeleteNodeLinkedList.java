import java.util.ArrayList;
import java.util.HashSet;

public class DeleteNodeLinkedList {

    public static void main(String[] args) {
        int[] testList = {4,5,1,9};
        ListNode test = new ListNode(testList[0]);
        ListNode tmp = test;
        for (int i = 1; i < testList.length; i++) {
            tmp.next = new ListNode(testList[i]);
            tmp = tmp.next;
        }
        deleteNode(test.next);
        System.out.println(test.toString());
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(this.val);
            while (next != null) {
                list.add(next.val);
                next = next.next;
            }
            return list.toString();
        }
    }

    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
    public static void deleteNode(ListNode node) {
        ListNode tmp = node;
        while (tmp != null) {
            if (tmp.next != null) {
                tmp.val = tmp.next.val;
                if (tmp.next.next == null) {
                    tmp.next = null;
                }
            }
            tmp = tmp.next;
        }
    }
}
