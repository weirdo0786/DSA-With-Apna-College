import java.util.Scanner;

public class sumOfN {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = 0;
        for(int i=0;i<n;i++){
            result = (n*(n+1))/2;
        }
        System.out.println("Sum of nth term is : "+result);
    }
}
