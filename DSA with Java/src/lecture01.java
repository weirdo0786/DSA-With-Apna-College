import java.util.Scanner;
 public class lecture01 {
    public static void main() {
        System.out.println("Hello Jarvis");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A value : ");
        int a = sc.nextInt();
        System.out.print("Enter the B value : ");
        int b = sc.nextInt();
        System.out.println("Total sum of the number is : "+(a+b));
        System.out.println("-----------Max of 3 Numbers----------");
        int x = 34;
        int y = 45;
        int z = 89;
        int result = (x>y && y>z) ? x : y>z ? y : z;
        int val = Math.max(x, Math.max(y, z));
        System.out.println("Maximum value is: " + val);
        System.out.println("Max of these three numbers are : "+result);
    }
}
