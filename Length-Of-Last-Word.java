// Given a string s consisting of words and spaces, return the length of 
// the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

class Solution
{
    public int lengthOfLastWord(String s)
    {
        String str[] = s.split(" ");
        return str[str.length-1].length();
    }
}


// Second Solution:

// class Solution
// {
//     public int lengthOfLastWord(String s)
//     {
//         s = s.trim();
//         int idx = 0;
//         for(int i = 0; i < s.length(); i++)
//         {
//             if(s.charAt(i) == ' ' && i > idx) idx = i;    
//         }
//         return s.length() - idx -1;
//     }
// }
