// Given an integer array nums and an integer k, return true if there are 
// two distinct indices i and j in the array such that nums[i] == nums[j] 
// and abs(i - j) <= k.

import java.util.HashMap;

class Solution
{
    public boolean containsNearbyDuplicate(int nums[], int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]) && 
               Math.abs(map.get(nums[i]) - i) <= k)
            {
                return true;
            }
            else map.put(nums[i], i);   
        }
        return false;
    }
}