package function;
import java.util.Scanner;
public class decimalToBinary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int temp = b;
        String str = "";
        while(temp>0){
            int rem = temp % 2;
            str = rem+str;
            temp = temp/2;
        }
        System.out.print(str);
    }
}
