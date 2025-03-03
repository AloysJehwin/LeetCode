class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i + j, new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }

        int index = 0;
        for (int key = 0; key < m + n - 1; key++) {
            List<Integer> diagonal = map.get(key);
            if (key % 2 == 0) {
                Collections.reverse(diagonal);
            }
            for (int num : diagonal) {
                result[index++] = num;
            }
        }
        return result;
    }
}