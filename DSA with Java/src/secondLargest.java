import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Input the array's element: ");
        int[] arr = new int[n];
        int[] arr1 = {1,2, 4, 8 , 5, 8};
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]= arr[i];
            }
        }
        System.out.print("Values are : ");
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
