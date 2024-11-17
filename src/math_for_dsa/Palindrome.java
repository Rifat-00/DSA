package math_for_dsa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        isPalindrome(n);
    }

    static void isPalindrome(int n) {
        int reversed = 0;
        int lastDigit;
        int temp = n;
        while( n > 0){
            lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(reversed == temp);
    }
}
