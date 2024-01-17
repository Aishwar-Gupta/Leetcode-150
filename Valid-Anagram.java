// Given two strings s and t, return true if t is an anagram of s, and 
// false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of 
// a different word or phrase, typically using all the original letters 
// exactly once.

class Solution
{
    public boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length()) return false;
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++)
        {
            if(arr[t.charAt(i) - 'a'] <= 0) return false;
            else
            {
                arr[t.charAt(i) - 'a']--; 
            }
        }
        return true;
    }
}



// Second Solution - using hashmap 

// import java.util.HashMap;

// class Solution
// {
//     public boolean isAnagram(String s, String t)
//     {
//         if(s.length() != t.length()) return false;
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i = 0; i < s.length(); i++)
//         {
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
//         }
//         for(int i = 0; i < t.length(); i++)
//         {
//             if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) <= 0)
//             {
//                 return false;
//             }
//             else
//             {
//                 map.put(t.charAt(i), map.get(t.charAt(i)) -1);
//             }
//         }
//         return true;
//     }
// }