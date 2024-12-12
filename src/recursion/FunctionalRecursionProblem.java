package recursion;

import java.util.Arrays;

public class FunctionalRecursionProblem {
    public static void main(String[] args) {
        String s = "MADAM";
        boolean b = isStringPalindrome(0,s);
        System.out.println(b);
    }
    public static void reverseArrayUsingPointer(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left<right){

            // swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //move the pointers towards the other
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArrayUsingRecursion(int i, int[] arr, int n){
        // remember, n is the number of elements not last index number
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] =temp;
        reverseArrayUsingRecursion(i+1,arr,n);
    }

    public static boolean isStringPalindrome(int i, String str){
        char[] s = str.toCharArray();
        int n = s.length;
        if(i >=  n/ 2){
            return true;
        }
        if(s[i] != s[n-i-1]){
            return false;
        }
        return isStringPalindrome(i+1,str);
    }
}
