// Given the head of a singly linked list and two integers left and right where
// left <= right, reverse the nodes of the list from position left to position 
// right, and return the reversed list.

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
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        if(head == null || left == right) return head;
        ListNode dummy = new ListNode(-1000);
        dummy.next = head;
        ListNode front = dummy;
        ListNode back = dummy;
        ListNode prev = dummy;
        ListNode nxt = dummy;
        int diff = right - left;
        while(diff > 0 || left > 0)
        {
            if(diff > 0)
            {
                back = back.next;
                diff--;
            }
            else if(left > 0)
            {
                prev = front;
                front = front.next;
                back = back.next;
                left--;
            }
        }
        nxt = back.next;
        back.next = null;
        ListNode rev = reverse(front);
        prev.next = rev;
        while (rev.next != null) 
        {
            rev = rev.next;    
        }
        rev.next = nxt;
        return dummy.next;
    }

    private ListNode reverse(ListNode front)
    {
        ListNode prev = null;
        ListNode curr = front;
        while (curr != null) 
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;   
        }
        return prev;
    }
}