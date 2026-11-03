package Arrays;

import java.util.Scanner;

public class maxSubArraySum {
    static void main(String[] args) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] arr = {2,4,6,8,10};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
