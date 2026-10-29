package Arrays;
import java.util.Scanner;
public class binarySearch {
    public static int binarySearch(int[] arr, int k){
        int a =0;
        int b = arr.length-1;
        while(a<=b){
            int mid = (a+b)/2;
            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]>k) {
                b = mid-1;
            }else {
                a = mid+1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of element : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array's element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int val = binarySearch(arr,k);
        if(val == -1){
            System.out.println("Element is not found in the given array");
        }
        else {
            System.out.println("Element "+k+" is found ");
        }
    }
}
