import java.util.Scanner;

public class starprinting {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("<----------Next Pattern---------->");
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("Half Pyramid Pattern");
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("Half Pyramid Pattern");

        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int chars=1; chars<=i;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
