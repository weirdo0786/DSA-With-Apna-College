import java.util.Scanner;
public class reverseTheGivenNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        int temp2 = n;
        int sum = 0;
        while(temp2>0){
            int rem = temp2 % 10;
            sum = sum + rem * (int)Math.pow(10,count-1);
            count--;
            temp2 = temp2/10;
        }
        System.out.println("Reverse of the Given Number is : "+sum);
    }
}
