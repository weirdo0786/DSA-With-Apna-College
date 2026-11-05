package Sorting;
public class selectionSort {
    public static void selectionSort(int[] arr){
        int i = 0;
        int n = arr.length;
        for( i =0;i<=n-2;i++){
            int min = i;
            for (int j=i+1; j<=n-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int k =0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        selectionSort(arr);
    }
}
