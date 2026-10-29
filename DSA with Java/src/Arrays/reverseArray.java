package Arrays;
import java.util.Scanner;
public class reverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array's element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}


