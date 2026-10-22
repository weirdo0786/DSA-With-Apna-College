package function;

import java.util.Scanner;

public class factorialNumber {
    public static void factorialNUm(int n){
        int product = 1;
        for(int i=1; i<=n;i++){
            product = product * i;
        }
        System.out.println("Factorial of the number is : "+product);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorialNUm(n);
    }
}
