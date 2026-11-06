package Array2D;
public class stairCaseSearch {
    public static boolean stairCaseSearch(int[][] matrix, int target){
        int row = 0;
        int col= matrix[0].length-1;
        while(row< matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println(matrix[row][col]);
                return true;
            } else if (target<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key = 33;
        boolean flag = stairCaseSearch(matrix,key);
        if (flag){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not in the array.");
        }
    }
}
