class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '1';

                // Check row
                if (row[i][num]) {
                    return false;
                }

                // Check column
                if (col[j][num]) {
                    return false;
                }

                // Find box number
                int boxNumber = (i / 3) * 3 + (j / 3);

                // Check box
                if (box[boxNumber][num]) {
                    return false;
                }

                // Mark as used
                row[i][num] = true;
                col[j][num] = true;
                box[boxNumber][num] = true;
            }
        }

        return true;
    }
}
