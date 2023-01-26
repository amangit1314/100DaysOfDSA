public class RotateImgBy90 {
    public static void main(String[] args) {
        int[][] img = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printImg(img);
        rotateImg(img);
        printImg(img);
    }

    public static void rotateImg(int[][] img) {
        // Transpose of image
        for(int i = 0; i < img.length - 1; i++) {
            for(int j = i; j < img[0].length; j++) {
                swap(img[i][j], img[j][i]);
            }
        }

        // Reverse each row of image matrix
        for(int i = 0; i < img.length - 1; i++) {
            for(int j = 0; j < img[0].length / 2; j++) {
                swap(img[i][j], img[i][img[0].length - 1 - j]);
            }
        }
    }
}