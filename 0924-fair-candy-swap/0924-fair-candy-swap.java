class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumAlice = 0, sumBob = 0;
    for (int x : aliceSizes) sumAlice += x;
    for (int y : bobSizes) sumBob += y;

    int delta = (sumAlice - sumBob) / 2; 

    Set<Integer> bobSet = new HashSet<>();
    for (int y : bobSizes) bobSet.add(y);

    for (int x : aliceSizes) {
        int y = x - delta; 
        if (bobSet.contains(y)) {
            return new int[]{x, y}; 
        }
    }

    return new int[0]; 
}

}