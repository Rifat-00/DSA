package math_for_dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
        findDivisor(n);
    }

    private static void findDivisor(int n) {
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i*i<n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }

            Collections.sort(divisors);
        }
        System.out.println(divisors);
    }

}
