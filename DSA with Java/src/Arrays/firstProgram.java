package Arrays;

import java.util.Scanner;

public class firstProgram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers of Input : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array's Element : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}


//fast access
//memory overhead
