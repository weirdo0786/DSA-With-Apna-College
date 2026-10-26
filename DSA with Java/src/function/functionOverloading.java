package function;

import java.util.Scanner;

public class functionOverloading {
    public static int sum (int a, int b){
        return (a+b);
    }
    public static float sum (int a, float b){
        return (a+b);
    }
    public static double sum (double a, float b){
        return (a+b);
    }
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int a = 45;
        int b = 36;
        int x = sum(a,b);
        float y = sum(34, 56.8f);
        double z = sum(45.87, 23);
        System.out.print(x+" "+y+" "+z);


    }
}
