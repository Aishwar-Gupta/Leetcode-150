// You are given an m x n integer matrix matrix with the following two properties:

//     Each row is sorted in non-decreasing order.
//     The first integer of each row is greater than the last integer of the 
//     previous row.

// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

class solution
{
    public boolean searchMatrix(int matrix[][], int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols -1;
        while (start <= end) 
        {
            int mid = start + (end - start)/2;
            int ele = matrix[mid / cols][mid % cols];
            if(ele == target) return true;
            else if(ele < target) start = mid+1;
            else end = mid-1;    
        }
        return false;
    }
}