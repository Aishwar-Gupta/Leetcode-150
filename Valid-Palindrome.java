// A phrase is a palindrome if, after converting all uppercase letters into 
// lowercase letters and removing all non-alphanumeric characters, it reads 
// the same forward and backward. Alphanumeric characters include letters 
// and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

class solution
{
    public boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) > 97 && s.charAt(i) < 123) ||
                s.charAt(i) > 47 && s.charAt(i) < 58)
            {
                sb.append(s.charAt(i));
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while(i < j)
        {
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}