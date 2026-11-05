package Sorting;
public class countingSort {
    public static void countingSort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
    }
}
