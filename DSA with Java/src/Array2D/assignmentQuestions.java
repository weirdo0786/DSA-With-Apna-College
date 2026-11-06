package Array2D;
public class assignmentQuestions {
    static void main(String[] args) {
        int[][] arr = {{4,7,8}, {8,8,7}};
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println();
        System.out.println("Sum of the seconds rows only");
        int sum = 0;
        int[][] ans= {{1,4,9}, {11,4,3},{2,2,3}};
        int x = ans.length;
        int y = ans[0].length;
            for (int j=0;j<y;j++){
                    sum +=ans[1][j];
            }
        System.out.println(sum);
        System.out.println();
        System.out.println("Transpose Matrix");
        for (int i=0;i<y;i++){
            for (int j=0;j<x;j++){
                System.out.print(ans[j][i]+" ");
            }
            System.out.println();
        }

    }
}
