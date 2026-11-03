package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class threeSUm {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Number : ");
        int target = sc.nextInt();
        System.out.print("Enter the number of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array : ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum>target){
                    k--;
                } else if (sum<target) {
                    j++;
                }
                else {
                    System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + target);
                    j++;
                    k--;
                }
            }
        }
    }
}
