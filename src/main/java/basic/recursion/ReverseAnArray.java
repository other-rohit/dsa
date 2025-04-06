package basic.recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 5, 6};
        System.out.println(Arrays.toString(reverseAnArray(a, 0, a.length-1)));
    }

    static int[] reverseAnArray(int[] input, int start, int end){
        if(start > end){
            return input;
        }
        input[start] = input[start] + input[end];
        input[end] = input[start] - input[end];
        input[start] = input[start] - input[end];
        return reverseAnArray(input, ++start, --end);
    }
}
