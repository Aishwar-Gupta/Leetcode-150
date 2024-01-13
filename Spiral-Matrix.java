// Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.ArrayList;
import java.util.List;

class Solution
{
    public List<Integer> spiralOrder(int matrix[][])
    {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        int r = 0;
        int c = 0;
        int dir = 0;
        while(r <= rows && c <= cols)
        {
            if(dir == 0)
            {
                for(int i = c; i <= cols; i++)
                {
                    list.add(matrix[r][i]);
                }
                r++;
            }
            else if(dir == 1)
            {
                for(int i = r; i <= rows; i++)
                {
                    list.add(matrix[i][cols]);
                }
                cols--;
            }
            else if(dir == 2)
            {
                for(int i = cols; i >= c; i--)
                {
                    list.add(matrix[rows][i]);
                }
                rows--;
            }
            else
            {
                for(int i = rows; i >= r; i--)
                {
                    list.add(matrix[i][c]);
                }
                c++;
            }
            dir = (dir + 1) % 4;
        }
        return list;
    }
}