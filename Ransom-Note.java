// Given two strings ransomNote and magazine, return true if ransomNote 
// can be constructed by using the letters from magazine and false 
// otherwise.

// Each letter in magazine can only be used once in ransomNote.

 class Solution
 {
    public boolean canConstruct(String ransomNote, String magazine)
    {
        int arr[] = new int[26];
        for(int i = 0; i < magazine.length(); i++)
        {
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++)
        {
            if(arr[ransomNote.charAt(i) - 'a'] <= 0) return false;
            else arr[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
 }



// Second Solution

// import java.util.HashMap;

// class Solution
// {
//     public boolean canConstruct(String ransomNote, String magazine)
//     {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i = 0; i < magazine.length(); i++)
//         {
//             map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) +1);
//         }
//         for(int i = 0; i < ransomNote.length(); i++)
//         {
//             if(!map.containsKey(ransomNote.charAt(i)) ||
//                 map.get(ransomNote.charAt(i)) <= 0)
//             {
//                 return false;
//             }
//             else if (map.containsKey(ransomNote.charAt(i)))
//             {
//                 map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) -1);
//             }    
//         }
//         return true;
//     }
// }