class Solution {
   public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length+1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - 1 - j] = temp;
            }
        }
        return image;
    }
}