package Array2D;
import java.util.Scanner;
public class matrices {
    public static boolean search(int[][] ans, int key){
        int m = ans.length;
        int n = ans[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(ans[i][j]==key){
                    System.out.print("Found at "+"("+i+","+j+")"+" ");
                    return true;
                }
            }
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows value : ");
        int m = sc.nextInt();
        System.out.print("Enter the cols value : ");
        int n = sc.nextInt();
        int[][] ans = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        boolean flag = search(ans, 9);
        if(flag){
            System.out.println();
            System.out.println("Key is Found");
        }
        else{
            System.out.println("Key is not present");
        }

    }
}
