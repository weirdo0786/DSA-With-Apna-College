package Strings;

import java.util.Scanner;

public class charArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
        char ch[] = str.toCharArray();
        char ch1[] = {'a','b','c','d'};
        String str1 = new String("Sachin");
        System.out.println(str1);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(ch[i]);
        }
//        System.out.println(ch);
        String str2 = sc.nextLine();
        System.out.println(str2);
        String st = sc.next();
        System.out.println(st);


    }
}
