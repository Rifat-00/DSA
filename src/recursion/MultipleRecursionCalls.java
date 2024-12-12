package recursion;

public class MultipleRecursionCalls {
    public static void main(String[] args) {
        int x = NthFibonacciRecursion(8);
        int z = 'g';

        System.out.println(z);
    }

    // Nth Fibonacci numbers
    public static int NthFibonacciRecursion(int n){
        if(n<= 1){
            return n;
        }
        return NthFibonacciRecursion(n-1)+NthFibonacciRecursion(n-2);
    }
}

