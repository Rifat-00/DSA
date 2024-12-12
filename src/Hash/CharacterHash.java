package Hash;

import java.util.Map;
import java.util.Scanner;

public class CharacterHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string:");
        s = sc.next();

        //precompute:
        int[] hash = new int[26]; // assuming the string is of lower case
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;  // using character - 'a' formula, to increment the corresponding index's value
        }

        int q;
        System.out.println("Number of Queries:");
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            System.out.println("Enter your Query:");
            c = sc.next().charAt(0);
            // fetch:
            System.out.println("Appeared: " + hash[c - 'a'] + " times");
        }


    }
}
