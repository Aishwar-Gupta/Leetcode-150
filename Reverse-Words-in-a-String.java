// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s 
// will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single 
// space.

// Note that s may contain leading or trailing spaces or multiple spaces 
// between two words. The returned string should only have a single space 
// separating the words. Do not include any extra spaces.

class Solution
{
    public String reverseWords(String s)
    {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                sb.append(s.charAt(i));
            }
            else
            {
                while(i < s.length()-1 && s.charAt(i) == ' ' && 
                      s.charAt(i + 1) == ' ')
                {
                    i++;
                }
                sb.append(' ');      
            }
        }
        s = sb.toString();
        String arr[] = s.split(" ");
        for(int i = 0; i < arr.length/2; i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        } 
        sb.setLength(0);
        for(int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if(i != arr.length-1) sb.append(' ');
        }
        return sb.toString();
    }
}