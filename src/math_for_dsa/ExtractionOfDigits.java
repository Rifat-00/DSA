package math_for_dsa;

import java.util.Scanner;

public class ExtractionOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        printDigits(n);
    }
    public static void printDigits(int n) {
        int last_digit;
        while(n> 0){
            last_digit = n%10;
            System.out.println(last_digit);
            n = n/10;
        }
    }
}


