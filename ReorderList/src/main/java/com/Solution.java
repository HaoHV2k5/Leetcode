package com;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode pre = null;

        while(second != null){
            ListNode next = second.next;
            second.next = pre;
            pre = second;
            second = next;
        }
        second = pre;
        ListNode first = head;
        while(second != null){

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;

        }





    }
}
