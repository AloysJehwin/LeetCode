class Solution {
    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        int max_val = 0;
        for (int[] row : grid) {
            for (int val : row) {
                max_val = Math.max(max_val, val);
            }
        } 

        int[][] dp = new int[m][n];
        int[] temp = new int[max_val + 1];

        Arrays.fill(temp, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[m-1][n-1] = 0;
        temp[grid[m-1][n-1]] = 0;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) continue;

                int down = (i + 1 < m) ? 
                    (dp[i + 1][j] == Integer.MAX_VALUE ? 
                    Integer.MAX_VALUE : dp[i + 1][j] + grid[i + 1][j]) : 
                    Integer.MAX_VALUE;

                int right = (j + 1 < n) ? 
                    (dp[i][j + 1] == Integer.MAX_VALUE ? 
                    Integer.MAX_VALUE : dp[i][j + 1] + grid[i][j + 1]) : 
                    Integer.MAX_VALUE;

                dp[i][j] = Math.min(down, right);

                if (dp[i][j] != Integer.MAX_VALUE) {
                    temp[grid[i][j]] = Math.min(temp[grid[i][j]], dp[i][j]);
                }
            }
        }

        for (int t = 1; t <= k; t++) {
            int[] min_prefix = new int[max_val + 1];
            min_prefix[0] = temp[0];

            for (int v = 1; v <= max_val; v++) {
                min_prefix[v] = Math.min(min_prefix[v - 1], temp[v]);
            }

            int[][] new_dp = new int[m][n];
            int[] new_temp = new int[max_val + 1];
            Arrays.fill(new_temp, Integer.MAX_VALUE);

            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i == m - 1 && j == n - 1) {
                        new_dp[i][j] = 0;
                        continue;
                    }

                    int down = (i + 1 < m) ? 
                        (new_dp[i + 1][j] == Integer.MAX_VALUE ? 
                        Integer.MAX_VALUE : new_dp[i + 1][j] + grid[i + 1][j]) : 
                        Integer.MAX_VALUE;

                    int right = (j + 1 < n) ? 
                        (new_dp[i][j + 1] == Integer.MAX_VALUE ? 
                        Integer.MAX_VALUE : new_dp[i][j + 1] + grid[i][j + 1]) : 
                        Integer.MAX_VALUE;

                    int cost = Math.min(down, right), t_cost = min_prefix[grid[i][j]];
                    new_dp[i][j] = Math.min(cost, t_cost);

                    if (new_dp[i][j] != Integer.MAX_VALUE) {
                        new_temp[grid[i][j]] = Math.min(new_temp[grid[i][j]], new_dp[i][j]);
                    }
                }
            }

            dp = new_dp;
            temp = new_temp;
        }

        return dp[0][0];
    }
}