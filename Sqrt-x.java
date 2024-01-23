// Given a non-negative integer x, return the square root of x rounded down 
// to the nearest integer. The returned integer should be non-negative as 
// well.

// You must not use any built-in exponent function or operator.

//     For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

class Solution
{
    public int mySqrt(int x)
    {
        if(x <= 1) return x;
        int lo = 1;
        int hi = x/2;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(mid == x/mid) return mid;
            else if(mid < x/mid) lo = mid+1;
            else hi = mid-1;
        }
        return hi;
    }
}