class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] rows = new boolean[m][n];
        boolean[][] columns = new boolean[m][n];
        boolean[][] subBox = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '1';
                int boxIndex = (i / 3)*3 + (j / 3);

                if (rows[i][num] || columns[j][num] || subBox[boxIndex][num]) {
                    return false;
                }

                rows[i][num] = true;
                columns[j][num] = true;
                subBox[boxIndex][num] = true;
            }
        }

        return true;
    }
}
