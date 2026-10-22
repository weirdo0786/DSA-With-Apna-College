package function;
import java.util.Scanner;

public class binomialCoefficient {
    public static int factorialNUm(int n){
        int product = 1;
        for(int i=1; i<=n;i++){
            product = product * i;
        }
        return product;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = factorialNUm(n)/(factorialNUm(r)*factorialNUm(n-r));
        System.out.print(result);
        sc.close();
    }
}
