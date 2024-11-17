package math_for_dsa;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        reverseNumber(n);
    }

    static void reverseNumber(int n) {
        int reverseNum = 0;
        int lastDigit;
        while (n > 0){
            lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(reverseNum);
    }
}
