// Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution
{
    public boolean isPalindrome(int x)
    {
        int a = x;
        int rev = 0;
        while (a > 0) 
        {
            int temp = a % 10;
            rev = rev * 10 + temp;
            a = a / 10;    
        }
        return (rev == x);
    }
}