package math_for_dsa;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGCD(a,b);
    }

    public static void printGCD(int a, int b) {
        if(a>b && a!=0) {
            a = a % b;
        }else{
            b = b % a;
        }
        if(a==0) {
            System.out.println("GCD: " + b);
        }else {
            System.out.println("GCD: " + a);
        }

    }
}
