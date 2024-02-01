// You are given two non-empty linked lists representing two non-negative 
// integers. The digits are stored in reverse order, and each of their 
// nodes contains a single digit. Add the two numbers and return the sum 
// as a linked list.

// You may assume the two numbers do not contain any leading zero, except 
// the number 0 itself.

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode start = dummy;
        int carry = 0;
        while(l1 != null && l2 != null)
        {
            int digit = l1.val + l2.val + carry;
            carry = 0;
            if(digit > 9)
            {
                carry = digit / 10;
                digit = digit % 10;
            }
            ListNode node = new ListNode(digit);
            start.next = node;
            start = start.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode left = (l1 == null)? l2 : l1;
        while(left != null)
        {
            if(carry == 0)
            {
                start.next = left;
                break;
            }
            int digit = left.val + carry;
            carry = 0;
            if(digit > 9)
            {
                carry = digit / 10;
                digit = digit % 10;
            }
            ListNode node = new ListNode(digit);
            start.next = node;
            start = start.next;
            left = left.next;
        }
        if(carry != 0)
        {
            ListNode node = new ListNode(carry);
            start.next = node;
        }
        return dummy.next;
    }
}







// Second Solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1 == null && l2 == null) return null;
//         else if(l1 == null) return l2;
//         else if(l2 == null) return l1;
        
//         ListNode dummy = new ListNode(-1);
//         ListNode head = dummy;
//         int carry = 0;
//         while(l1 != null || l2 != null)
//         {
//             if(l1 == null)
//             {
//                 int value = 0;
//                 if(l2.val + carry <= 9)
//                 {
//                     value = l2.val + carry;
//                     carry = 0;
//                 }
//                 else if(l2.val + carry > 9)
//                 {
//                     value = (l2.val + carry) % 10;
//                     carry = 1;
//                 }
//                 ListNode digit = new ListNode(value);
//                 head.next = digit;
//                 head = digit;
//                 l2 = l2.next;
//             }
//             else if(l2 == null)
//             {
//                 int value = 0;
//                 if(l1.val + carry <= 9)
//                 {
//                     value = l1.val + carry;
//                     carry = 0;
//                 }
//                 else if(l1.val + carry > 9)
//                 {
//                     value = (l1.val + carry) % 10;
//                     carry = 1;
//                 }
//                 ListNode digit = new ListNode(value);
//                 head.next = digit;
//                 head = digit;
//                 l1 = l1.next;
//             }
//             else
//             {
//                 int value = 0;
//                 if(l1.val + l2.val + carry <= 9)
//                 {
//                     value = l1.val + l2.val + carry;
//                     carry = 0;
//                 }
//                 else if(l1.val + l2.val + carry > 9)
//                 {
//                     value = (l1.val + l2.val + carry) % 10;
//                     carry = 1;
//                 }
//                 ListNode digit = new ListNode(value);
//                 head.next = digit;
//                 head = digit;
//                 l1 = l1.next;
//                 l2 = l2.next;
//             }
//         }
//         if(carry != 0)
//         {
//             ListNode digit = new ListNode(carry);
//             head.next = digit;
//             head = digit;
//             carry = 0;
//         }
//         return dummy.next;
//     }
// }