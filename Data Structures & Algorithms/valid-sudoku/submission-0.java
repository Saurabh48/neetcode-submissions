class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++) {
            Set<Character> stc = new HashSet<>();
            Set<Character> str = new HashSet<>();
            Set<Character> std = new HashSet<>();
            for(int j = 0;j<9;j++) {
                if(board[j][i] != '.') {
                    if(stc.contains(board[j][i])) return false;
                    else stc.add(board[j][i]);
                }
                if(board[i][j] != '.') {
                    if(str.contains(board[i][j])) return false;
                    else str.add(board[i][j]);
                }
                int r = 3*(i/3) + (j/3);
                int c = 3*(i%3) + (j%3);
                if(board[r][c] != '.') {
                    if(std.contains(board[r][c])) return false;
                    else std.add(board[r][c]);
                }
            }
        }
        return true;
    }
}
