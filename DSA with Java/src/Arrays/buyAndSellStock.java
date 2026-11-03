package Arrays;
import java.util.Scanner;
public class buyAndSellStock {
    public static int buyandsell(int[] sellprices){
        int n = sellprices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(buyPrice<sellprices[i]){ // check for profit
                int profit = sellprices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit,profit); // globally maximum profit
            }
            else{
                buyPrice = sellprices[i];
            }
        }
        return maxProfit;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsell(prices));
    }
}

