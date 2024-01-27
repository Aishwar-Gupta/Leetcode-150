// Given the head of a sorted linked list, delete all nodes that have 
// duplicate numbers, leaving only distinct numbers from the original list. 
// Return the linked list sorted as well.

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
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1000);
        dummy.next = head;
        ListNode start = dummy;
        while(head != null && head.next != null)
        {
            if(head.val != head.next.val)
            {
                start.next = head;
                start = start.next;
            }
            else
            {
                while(head.next != null && head.val == head.next.val)
                {
                    head = head.next;
                }
            }
            head = head.next;
            start.next = null;
        }
        start.next = head;
        return dummy.next;
    }
}