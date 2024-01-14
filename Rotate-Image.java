// You are given an n x n 2D matrix representing an image, rotate the image 
// by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the 
// input 2D matrix directly. DO NOT allocate another 2D matrix and do the 
// rotation.

class Solution
{
    public void rotate(int matrix[][])
    {
        transpose(matrix);
        reverse(matrix);
    }

    private void transpose(int matrix[][])
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverse(int matrix[][])
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length -j -1];
                matrix[i][matrix[0].length -j -1] = temp;
            }
        }
    }
}