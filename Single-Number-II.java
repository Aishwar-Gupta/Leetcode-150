// Given an integer array nums where every element appears three times except
// for one, which appears exactly once. Find the single element and return 
// it.

// You must implement a solution with a linear runtime complexity and use 
// only constant extra space.

import java.util.HashMap;

class solution
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int candidate = 0;
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(int i : map.keySet())
        {
            if(map.get(i) == 1) candidate = i;
        }
        return candidate;
    }
}


// Second Solution

// class Solution {
//     public int singleNumber(int[] nums) {
//         int one = 0, two = 0, three = 0;
//         for(int i = 0; i < nums.length; i++)
//         {
//             two = two | (one & nums[i]);
//             one = one ^ nums[i];
//             three = one & two;
//             one = one & ~three;
//             two = two & ~three;
//         }
//         return one;
//     }
// }