package Arrays;
import java.util.*;
public class twoSum {
    static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int ans[] = new int[2];
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                ans[0] = i;
                ans[1] = j;
                break;
            }
        }
        for (int k=0;k<2;k++){
            System.out.print(ans[k]+" ");
        }
    }
}
