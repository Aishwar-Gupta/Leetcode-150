// Given two binary strings a and b, return their sum as a binary string.

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 && j >= 0)
        {
            if(a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 0)
            {
                carry = 1;
                sb.append('0');
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 1)
            {
                carry = 1;
                sb.append(1);
            }
            else if((a.charAt(i) == '1' || b.charAt(j) == '1') && carry == 0)
            {
                sb.append(1);
            }
            else if((a.charAt(i) == '1' || b.charAt(j) == '1') && carry == 1)
            {
                carry = 1;
                sb.append(0);
            }
            else if((a.charAt(i) == '0' && b.charAt(j) == '0') && carry == 1)
            {
                carry = 0;
                sb.append(1);
            }
            else if((a.charAt(i) == '0' && b.charAt(j) == '0') && carry == 0)
            {
                sb.append(0);
            }
            i--;
            j--;
        }

        while(i >= 0)
        {
            if(a.charAt(i) == '1' && carry == 1) sb.append(0);
            else if(a.charAt(i) == '0' && carry == 0) sb.append(0);
            else if(a.charAt(i) == '1' || carry == 1) 
            {
                sb.append(1); 
                carry = 0;
            }
            i--;
        }
        while(j >= 0)
        {
            if(b.charAt(j) == '1' && carry == 1) sb.append(0);
            else if(b.charAt(j) == '0' && carry == 0) sb.append(0);
            else if(b.charAt(j) == '1' || carry == 1)
            {
                sb.append(1); 
                carry = 0;
            } 
            j--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}