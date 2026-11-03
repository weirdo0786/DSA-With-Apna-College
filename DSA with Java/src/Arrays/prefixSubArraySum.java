package Arrays;
public class prefixSubArraySum {
    static void main(String[] args) {
        int currSum = 0;
        int[] arr = {2,4,6,8,10};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        // calculate the prefix array
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
