package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {21,22,24},
                {56,62,55},
                {73,44,61}
        };
        int t = 63;
        int x = searchIn2DArray(arr,t);
        System.out.println(x);
    }

    static int linearSearch(int[] arr, int target){
        for(int i:arr){
            if (i == target){
                return 1;
            }
        }
        return -1;
    }

    //minimum number using linear search
    static int minimumNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int i:arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }

    //maximum number using linear search
    static int maximumNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    //search in 2D Array
    static int searchIn2DArray(int[][] arr, int target){

        for(int[] a : arr){
            for(int i : a){
                if(i == target){
                    return 1;
                }
            }
        }
        return -1;
    }

    //even digits

}
