package function;
import java.util.Scanner;


public class functionProblem {

    //Without parameterized Functions
    public static void printF(){
        System.out.println("Hello Jarvis");
        return;
    }

    //With Parameterized Functions
    public static int addSum(int a , int b){
        return a+b;
    }

    public static void swap(int x, int y){
//        System.out.println(x+" "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+" "+y);
    }

    public static int multiply(int x, int y){
        return x*y;
    }

     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         printF();
         int c = addSum(4,19);
         System.out.println("Sum of two number is : "+c);
         int x = sc.nextInt();
         int y = sc.nextInt();
         swap(x,y);
         System.out.println("Calling in the main function");
         System.out.println(x+" "+y); // call by value
//         swap1(&x, &y);
         int res = multiply(4,6);
         System.out.println("Multiply is : "+res);
         sc.close();
     }
}
