// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode start = dummy;
        while (list1 != null && list2 != null) 
        {
            if(list1.val <= list2.val)
            {
                start.next = list1;
                list1 = list1.next;
            }    
            else
            {
                start.next = list2;
                list2 = list2.next;
            }
            start = start.next;
        }
        if(list1 != null) start.next = list1;
        if(list2 != null) start.next = list2;
        return dummy.next;
    }
}