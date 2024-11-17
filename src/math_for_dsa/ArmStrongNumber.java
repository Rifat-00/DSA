package math_for_dsa;

import java.util.Scanner;

import static java.lang.Math.log10;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        isArmstrong(n);
    }

    static void isArmstrong(int n) {

        int sum = 0;
        int originalNumber = n;
        int count = (int)log10(n) + 1; //look how this works to find the number of digits in the number
        int lastDigit;
        while (n > 0){
            lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit,count));
            n = n / 10;
        }
        if(originalNumber == sum){
            System.out.println("The number is an Armstrong number.");
        }else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
