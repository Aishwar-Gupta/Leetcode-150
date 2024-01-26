// Given an array of strings strs, group the anagrams together. You can 
// return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a 
// different word or phrase, typically using all the original letters 
// exactly once.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution
{
    public List<List<String>> groupAnagrams(String strs[])
    {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(map.containsKey(s))
            {
                List<String> list = map.get(s);
                list.add(strs[i]);
                map.put(s, list);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(s, list);
            }
        }
        for(List<String> list : map.values())
        {
            ans.add(list);
        }
        return ans;
    }
}