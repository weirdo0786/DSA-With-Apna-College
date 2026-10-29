package Arrays;
import java.util.Scanner;
public class linearSearch {
    public static int linearSearch(int[] arr,int n, int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
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
        int val = linearSearch(arr,n,k);
        if(val == -1){
            System.out.println("Element is not found in the given array");
        }
        else {
            System.out.println("Element "+k+" is found at "+val);
        }
    }
}
