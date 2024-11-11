class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Initialize queue with all initial rotten oranges and count fresh oranges
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }

        // If there are no fresh oranges, return 0 (all are already rotten or empty)
        if (freshCount == 0) return 0;

        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS to spread the rot
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];

                // Check all four directions
                for (int[] direction : directions) {
                    int newRow = r + direction[0];
                    int newCol = c + direction[1];

                    // If the adjacent cell is a fresh orange, rot it
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;  // Mark as rotten
                        queue.offer(new int[]{newRow, newCol});
                        freshCount--;
                        rotted = true;
                    }
                }
            }

            // Only increment minutes if any fresh oranges were rotted in this level
            if (rotted) minutes++;
        }

        // If there are still fresh oranges left, return -1; otherwise, return minutes
        return freshCount == 0 ? minutes : -1;
    }
}