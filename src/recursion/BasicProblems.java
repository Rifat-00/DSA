package recursion;

public class BasicProblems {
    public static void main(String[] args) {
//        printNames("John",5);
//        printNumbers(1,5);
        int x = factorialOfN(4);
        System.out.println(x);
    }

    // 1. Print names N times
    public static void printNames(String name, int n) {
        if(n == 0){
            return;
        }
        System.out.println(name);
        printNames(name, n - 1);
    }

    // 2. Print numbers from 1 to N
    public static void printNumbers(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        printNumbers(i+1,n);
    }

    // 3. Print numbers from N to 1
    public static void printReverseNumbers(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(n);
        printReverseNumbers(i,n-1);
    }

    // 4. Print 1 to N using backtracking
    public static void printNumberUsingBacktracking(int i, int n){
        if(i<1){
            return;
        }
        printNumberUsingBacktracking(i-1,n);
        System.out.println(i);

    }


    /* sum of first N number */
    //parameterised way
    public static void printSumOfNParameter(int i , int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        printSumOfNParameter(i-1,sum + i);

    }
    //functional way
    public static int printSumOfNFunctional(int n){
        if(n==0){
            return 0;
        }
        return n + printSumOfNFunctional(n-1);
    }

    /*Factorial of N*/
    public static int factorialOfN(int n){
        if(n==0){
            return 1;
        }
        return n * factorialOfN(n-1);
    }


}
