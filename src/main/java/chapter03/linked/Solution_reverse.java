package chapter03.linked;

/**
 * 链表反转
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class Solution_reverse {

    public  ListNode reverseList(ListNode head){
     if (head==null)return head;
     ListNode pre = head;
     ListNode cur = head.next;
     ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur= temp;
        }
        head.next = null;
        return pre;
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }


}
