// Last updated: 9/11/2026, 9:42:10 AM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    public boolean solve(char[][] board) {
7
8        for (int i = 0; i < 9; i++) {
9            for (int j = 0; j < 9; j++) {
10
11                if (board[i][j] == '.') {
12
13                    for (char num = '1'; num <= '9'; num++) {
14
15                        if (isValid(board, i, j, num)) {
16
17                            board[i][j] = num;
18
19                            if (solve(board)) {
20                                return true;
21                            }
22
23                            board[i][j] = '.';
24                        }
25                    }
26
27                    return false;
28                }
29            }
30        }
31
32        return true;
33    }
34
35    public boolean isValid(char[][] board, int row, int col, char num) {
36
37        for (int i = 0; i < 9; i++) {
38
39            if (board[row][i] == num)
40                return false;
41
42            if (board[i][col] == num)
43                return false;
44
45            int r = 3 * (row / 3) + i / 3;
46            int c = 3 * (col / 3) + i % 3;
47
48            if (board[r][c] == num)
49                return false;
50        }
51
52        return true;
53    }
54}