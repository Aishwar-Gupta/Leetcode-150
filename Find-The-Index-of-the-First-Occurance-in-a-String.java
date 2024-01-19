// Given two strings needle and haystack, return the index of the first 
// occurrence of needle in haystack, or -1 if needle is not part of 
// haystack.

// class Solution
// {
//     public int strStr(String haystack, String needle)
//     {
//         if(haystack.length() <= needle.length()) return -1;
//         for(int i = 0; i < haystack.length(); i++)
//         {
//             if(haystack.indexOf(needle) == i) return i;
//         }
//         return -1;
//     }
// } 




// Second Solution

// class Solution
// {
//     public int strStr(String haystack, String needle)
//     {
//         if(haystack.length() <= needle.length()) return -1;
//         return haystack.indexOf(needle);
//     }
// }




// Third Solution

class Solution
{
    public int strStr(String haystack, String needle)
    {
        if(haystack.length() < needle.length()) return -1;
        int j = 0;
        for(int i = 0; i <= haystack.length(); i++)
        {
            String s = haystack.substring(j, i);
            if(s.equals(needle)) return j;
            else if(i - j == needle.length())
            {
                j++;
            }
        }
        return -1;
    }
}