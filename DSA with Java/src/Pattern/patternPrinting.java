package pattern;
import java.util.Scanner;

public class patternPrinting {
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

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------X Print---------->");
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                if (i == j || (i+j==n+1)) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Opposite Pyramid---------->");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j>n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Opposite Pyramid---------->");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Hollow Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1) || (j==1) || (i==n) || (j==n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Solid Rhombus Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Inverted Pyramid Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Inverted Number Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Couting Number Pattern---------->");
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                ++count;
                System.out.print(count+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next 0-1 triangle Number Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Butterfly Pattern---------->");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("<----------Next Pattern---------->");
        System.out.println("<----------Next Diamond Pattern---------->");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
