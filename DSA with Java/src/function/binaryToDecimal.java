package function;
import java.util.Scanner;

public class binaryToDecimal {
    public static void printDecimal(int n){
        int count = 0;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem*(int)Math.pow(2,count);
            count++;
            n = n/10;
        }
        System.out.print(sum);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecimal(n);
        sc.close();
    }
}
