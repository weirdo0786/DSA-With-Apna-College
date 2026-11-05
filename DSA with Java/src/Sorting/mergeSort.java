package Sorting;
import java.util.Scanner;
public class mergeSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {2,4,6,8,10};
        int[] arr2 = {3,5,7,9,11};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n1+n2];
        int n = ans.length;
        int i=0, j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }
        while(i<n1){
            ans[k++] = arr1[i++];
        }
        while(j<n2){
            ans[k++] = arr2[j++];
        }
        for (int x=0;x<n;x++){
            System.out.print(ans[x]+" ");
        }
    }
}
