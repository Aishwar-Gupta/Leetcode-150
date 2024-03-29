// Given an integer array nums, return an array answer such that answer[i] 
// is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 
// 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the 
// division operation.

class Solution
{
    public int[] productExceptSelf(int nums[])
    {
        int n = nums.length;
        int ans[] = new int[n];
        int forward[] = new int[n];
        int back[] = new int[n];
        forward[0] = 1;
        back[n-1] = 1;
        for(int i = 1; i < n; i++)
        {
            forward[i] = forward[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--)
        {
            back[i] = back[i+1] * nums[i+1];
        }
        for(int i = 0; i < n; i++)
        {
            ans[i] = forward[i] * back[i];
        }
        return ans;
    }
}