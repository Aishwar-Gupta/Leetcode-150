// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need 
// to be validated according to the following rules:

//     Each row must contain the digits 1-9 without repetition.
//     Each column must contain the digits 1-9 without repetition.
//     Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 
//     1-9 without repetition.

// Note:

//     A Sudoku board (partially filled) could be valid but is not 
//     necessarily solvable.
//     Only the filled cells need to be validated according to the 
//     mentioned rules.

import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] != '.')
                {
                    String row = board[i][j] + " at row " + i;
                    String col = board[i][j] + " at col " + j;
                    String grid = board[i][j] + " at grid " + i/3 + " - " + j/3;
                    if(set.contains(row) || set.contains(col) || set.contains(grid))
                    {
                        return false;
                    } 
                    else
                    {
                        set.add(row);
                        set.add(col);
                        set.add(grid);
                    }
                }
            }
        }
        return true;
    }
}