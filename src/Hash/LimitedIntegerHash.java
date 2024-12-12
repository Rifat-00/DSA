package Hash;

import java.util.Scanner;

public class LimitedIntegerHash {
    public static void main(String[] args) {
        // take input from user for the size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        //initialize the array
        int[] arr = new int[n];
        System.out.println("Input " + n + " elements in the Array:");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        //pre-computing
        // assuming highest number is 12, so taking the size of 13 will give us index of 12
        int[] hash = new int[13]; //by default, all the elements are set to 0
        for (int i = 0; i<n;i++){
            hash[arr[i]] += 1; // iterating over input array, and incrementing corresponding index
            //example:
//            input array: arr = [1, 2, 2, 3, 2]
            // first iteration,
            // i = 0; arr[0] = 1; hash[arr[0]] -> hash[1] -> hash[1] was 0, now 0+=1 = 1 -> hash[1] = 1
            // remember, index of hash array, represents the actual element in the arr array
            // after the iteration, one was encountered once, so hash[1] = 1 will represent that 1 is present in the arr array only once
         }

        //query handling
        System.out.println("Number of Queries:");
        int q = sc.nextInt(); //numbers of total query
        while(q-- != 0){
            System.out.println("Enter the query:");
            int num = sc.nextInt(); // actual query
            System.out.println("Appeared: "+ hash[num] + " times.");
        }
    }
}
