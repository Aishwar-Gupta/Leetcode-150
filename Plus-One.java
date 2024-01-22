// You are given a large integer represented as an integer array digits, 
// where each digits[i] is the ith digit of the integer. The digits are 
// ordered from most significant to least significant in left-to-right 
// order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of 
// digits.

class Solution
{
    public int[] plusOne(int digits[])
    {
        int carry = 0;
        int one = 1;
        for(int i = digits.length-1; i >= 0; i--)
        {
            int sum = digits[i] + one + carry;
            carry = 0;
            one = 0;
            if(sum > 9)
            {
                carry =  sum / 10;
                sum = sum % 10;
            }
            digits[i] = sum;
            if(carry == 0) break;
        }
        if(carry != 0)
        {
            int arr[] = new int[digits.length+1];
            arr[0] = carry;
            for(int i = 0; i < digits.length; i++)
            {
                arr[i+1] = digits[i];
            }
            digits = arr;
        }
        return digits;
    }
}