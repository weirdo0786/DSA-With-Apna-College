package Arrays;
import java.util.Scanner;
public class largestNumber {
    public static int largestFun(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array's element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int val = largestFun(arr);
        System.out.print("Max value is "+ val);
    }
}
