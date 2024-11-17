package math_for_dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.log10;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //reverseNumber(n);
        //palindromeNumberCheck(n);// Function to check palindrome number.
        //countNumberOfDigits(n); // Function to count number of digits in a number.
        //checkArmstrong(n);
        //printDivisor(n);
        //checkPrime(n);
        System.out.println(findGCD(a,b));
        sc.close();
    }

    static void printDigits(int n) {
        int last_digit;
        while(n > 0){
            last_digit = n % 10;
            System.out.println(last_digit);
            n = n/10;
        }
    }

    static void countNumberOfDigits(int n){
        int count = (int)log10(n) + 1;
        System.out.println("available digits in the number:"+ count);
    }

    static void reverseNumber(int n) {
        int reversed = 0;
        while (n!= 0) {
            int lastDigit = n % 10;  // Extract the last digit.
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(reversed);
    }

    static void palindromeNumberCheck(int n) {
        int reversed = 0;
        int duplicate = n;
        while (n!= 0) {
            int lastDigit = n % 10;  // Extract the last digit.
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        if(reversed == duplicate) {
            System.out.println("It's a palindrome number.");
        }else {
            System.out.println("It's not a palindrome number.");
        }
    }

    static void checkArmstrong(int n) {
        int last_digit;
        int duplicate = n;
        int count = (int)log10(n) + 1;
        int sum = 0;
        while(n > 0){
            last_digit = n % 10;
            n = n/10;
            sum = sum + (int)Math.pow(last_digit, count);
        }
        if (sum == duplicate) {
            System.out.println("It's an Armstrong number.");
        }else {
            System.out.println("It's not an Armstrong number.");
        }
    }

//    static void printDivisor(int n){
//        for(int i=1; i<=n; i++){
//            if(n%i == 0){
//                System.out.println(i);
//            }
//        }
//    }

    static void printDivisor(int n){
        List<Integer> divisionList = new ArrayList<>();
        for(int i=1; i*i<n; i++){ // sqrt(n) and i*i is same as checking for factors upto sqrt(n) like 6*6 is 36 and sqrt(36) is also 6
            if(n%i == 0){
                divisionList.add(i);
                if(n/i != i){
                    divisionList.add(n/i);
                }
            }
        }
        Collections.sort(divisionList);
        System.out.println(divisionList.toString());
    }

    static void checkPrime(int n){

        int count = 0;
        for(int i =1; i*i<=n;i++){
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("It's a prime number.");
        }else {
            System.out.println("It's not a prime number");
        }
    }

    static int findGCD(int a, int b) {
        while(a > 0 && b>0)
        {
            if(a>b){
                a = a%b;
            }else {
                b = b%a;
            }
        }

        if(a == 0){return b;}
        return a;
    }
}
