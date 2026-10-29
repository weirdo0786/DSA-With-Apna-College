package Arrays;
import java.util.Scanner;
public class pairsInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array's element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int current = arr[i]; // 2,4,6,8,10
            for(int j=i+1; j<n;j++){
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
