package Arrays;

public class kadaneAlgoMaxArraySum {

    public static void kadanes(int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for(int i=0; i<numbers.length; i++){
                cs += numbers[i];
                if(cs <0){
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
        System.out.println(ms);
    }
    static void main(String[] args) {
        int currSum = 0;
        int[] arr = {-2,-3, 4, -1, -2, 1,5, -3};
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
        int num[] = {-2,-3, 4, -1, -2, 1,5, -3};
        kadanes(num);
        System.out.println(maxSum);
    }
}
