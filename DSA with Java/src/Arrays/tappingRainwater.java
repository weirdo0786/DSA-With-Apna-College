package Arrays;
public class tappingRainwater {
    public static int trappingWater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int res = 0;
        for(int i=0; i<n; i++){
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappingWater(arr));
    }
}
