// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

import java.util.HashMap;

class solution
{
    public int[] twoSum(int nums[], int target)
    {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                arr[0] = map.get(nums[i]);
                arr[1] = i;
            }
            else
            {
                map.put(target - nums[i], i);
            }
        }
        return arr;
    }
}