package Sorting;
import java.util.Scanner;
public class bubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<=n-2;i++){
            for (int j = 0; j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

//        2025ume0259
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
    }
}
