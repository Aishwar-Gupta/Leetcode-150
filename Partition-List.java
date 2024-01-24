// Given the head of a linked list and a value x, partition it such that 
// all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of 
// the two partitions.

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
    public ListNode partition(ListNode head, int x)
    {
        if(head == null || head.next == null) return head;
        ListNode dummy1 = new ListNode(-1000);
        ListNode dummy2 = new ListNode(-1000);
        ListNode less = dummy1;
        ListNode more = dummy2;
        while(head != null)
        {
            if(head.val < x)
            {
                less.next = head;
                less = less.next;
            }
            else
            {
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }
        more.next = null;
        less.next = dummy2.next;
        return dummy1.next;
    }
}