// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between 
// a letter in pattern and a non-empty word in s.

import java.util.HashMap;

class Solution
{
    public boolean wordPattern(String pattern, String s)
    {
        String arr[] = s.split(" ");
        if(pattern.length() != arr.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++)
        {
            char c = pattern.charAt(i);
            if(map.containsKey(c) && !map.get(c).equals(arr[i])) return false;
            else if(!map.containsKey(c) && map.containsValue(arr[i])) return false;
            if(!map.containsKey(c)) map.put(c, arr[i]);
        }
        return true;
    }
}