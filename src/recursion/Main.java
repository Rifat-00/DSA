package recursion;

public class Main {
    public static void main(String[] args) {

        //Recursion -> When a function calls itself until a particular condition is met.
        // base condition
        // stack overflow
        // recursion tree
        printNumbers();
    }
    static int count = 0;
    public static void printNumbers() {
        if(count == 10){ return;}
        System.out.println(count);
        count++;
        printNumbers();
    }
}
