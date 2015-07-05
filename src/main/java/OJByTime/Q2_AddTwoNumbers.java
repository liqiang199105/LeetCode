package OJByTime;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each
 * of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Q2_AddTwoNumbers {
    public static void main(String []args){
        // Input
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);

        // Output
        Q2_AddTwoNumbers addTwoNumbers = new Q2_AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        int up = (l1.val + l2.val) /10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode last = result;
        while (l1 != null && l2 != null){
            last.next = new ListNode((l1.val + l2.val + up) % 10);
            up = (l1.val + l2.val + up) / 10;
            l1 = l1.next;
            l2 = l2.next;
            last = last.next;
        }

        while (l1 != null){
            last.next = new ListNode((l1.val + up) % 10);
            up = (l1.val + up) / 10;
            l1 = l1.next;
            last = last.next;
        }
        while (l2 != null){
            last.next = new ListNode((l2.val + up) % 10);
            up = (l2.val + up) / 10;
            l2 = l2.next;
            last = last.next;
        }
        if (up > 0) {
            last.next = new ListNode(up);
        }
        return result;
    }
}

//Definition for singly-linked  list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
