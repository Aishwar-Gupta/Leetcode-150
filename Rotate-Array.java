// Given an integer array nums, rotate the array to the right by k steps,
// where k is non-negative.

class Solution
{
    public void rotate(int nums[], int k)
    {
        if(k == 0 || k % nums.length == 0) return ;
        else k = k % nums.length; 
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k);
        reverse(nums, k+1, nums.length-1);
    }

    private void reverse(int nums[], int idx1, int idx2)
    {
        while(idx1 < idx2) 
        {
            int temp = nums[idx1];
            nums[idx1++] = nums[idx2];
            nums[idx2--] = temp;
        }
    }
}
