// Given the head of a linked list, rotate the list to the right by k places.

class ListNode
{
    int val;
    ListNode next;
}

class Solution
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head == null || head.next == null) return head;
        int len = 0;
        ListNode start = head;
        while(start != null)
        {
            start = start.next;
            len++;
        }
        k = k % len;
        if(k == 0 || k == len) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(k > 0)
        {
            fast = fast.next;
            k--;
        }
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode node = slow.next;
        slow.next = null;
        fast.next = head;
        return node;
    }
}