class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                if (productCount.containsKey(product)) {
                    count += 8 * productCount.get(product);
                }
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        return count;
    }
}