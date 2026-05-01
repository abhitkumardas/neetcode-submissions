class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];

                int boxIndex = (i / 3) * 3 + (j / 3);

                String rowString = num + "_" + i + "row";
                String columnString = num + "_" + j + "column";
                String boxString = num + "_" + boxIndex + "box";

                if (!seen.add(rowString) || !seen.add(columnString) || !seen.add(boxString)) {
                    return false;
                }
            }
        }

        return true;
    }
}
