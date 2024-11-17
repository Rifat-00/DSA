package math_for_dsa;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        checkPrime(n);
    }

    private static void checkPrime(int n) {
        int count = 0;
        int lastDigit = 0;

        for(int i = 1; i*i <= n; i++){
            if(n%i == 0){
                count +=1;
                if(n/i != i){
                    count +=1;
                }
            }
        }
        if(count == 2){
            System.out.println("It's a prime number.");
        }else{
            System.out.println("It's not a prime number.");
        }
    }
}
