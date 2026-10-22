import java.util.Scanner;
public class primeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = sc.nextInt();
        boolean flag;
        if(n >= 2) {
            flag = true;
        } else {
            flag = false;
        }
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("It is a " + n + " Prime Number");
        }
        else{
            System.out.println("Not a prime Number ");
        }
    }
}
