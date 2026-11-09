package Array2D;
public class seach2DMatrix {
    public static boolean searchIn2D(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int key = 33;

        boolean flag = searchIn2D(matrix, key);

        if (flag) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not in the array.");
        }
        System.out.println("Correct solution");
    }
}