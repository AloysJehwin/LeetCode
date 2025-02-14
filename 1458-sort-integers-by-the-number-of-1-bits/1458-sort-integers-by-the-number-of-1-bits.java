import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxedArr, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return (countA == countB) ? Integer.compare(a, b) : Integer.compare(countA, countB);
        });

        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }
}
