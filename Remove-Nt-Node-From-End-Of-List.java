// Given the head of a linked list, remove the nth node from the end of the 
// list and return its head.

class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
    }
}

class Solution
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(n > 0)
        {
            fast = fast.next;
            n--;
        }
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}