class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        
        for (int i = 0; i <= n - m * k; i++) { 
            int count = 0;
            
            for (int j = 0; j < m * k; j++) {
                if (arr[i + j] == arr[i + (j % m)]) {
                    count++;
                } else {
                    break;
                }
            }
            
            if (count == m * k) {
                return true;
            }
        }
        
        return false;
    }
}
