static boolean solveSudoku(int[][] board) 
{
        for (int row = 0; row < N; row++) 
            {
            for (int col = 0; col < N; col++) 
                {
                if (board[row][col] == 0) 
                    { // empty cell
                    for (int num = 1; num <= 9; num++) 
                        {
                        if (isSafe(board, row, col, num)) 
                            {
                            board[row][col] = num;
                            if (solveSudoku(board)) 
                                {
                                return true;
                            } else {
                                board[row][col] = 0; // backtrack
                            }
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // solved
    }