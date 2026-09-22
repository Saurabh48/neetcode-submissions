class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++) {
            int stc = 0;
            int str = 0;
            int std = 0;
            for(int j = 0;j<9;j++) {
                if(board[j][i] != '.') {
                    int val = board[j][i] - '1';
                    if((stc & (1 << val)) > 0) return false;
                    else stc |= (1 << val);
                }
                if(board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    if((str & (1 << val)) > 0) return false;
                    else str |= (1 << val);
                }
                int r = 3*(i/3) + (j/3);
                int c = 3*(i%3) + (j%3);
                if(board[r][c] != '.') {
                    int val = board[r][c] - '1';
                    if((std & (1 << val)) > 0) return false;
                    else std |= (1 << val);
                }
            }
        }
        return true;
    }
}
