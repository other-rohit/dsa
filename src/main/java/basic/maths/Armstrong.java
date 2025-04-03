package basic.maths;

import java.util.Arrays;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrongBruteForce(371));
        System.out.println(isArmstrongOptimalSolution(371));
    }

    static boolean isArmstrongBruteForce(int a){
        char[] chars = String.valueOf(a).toCharArray();
        int length = chars.length;
        int result = 0;

        for(char aChar: chars){
            result = result + (int) Math.pow(Integer.parseInt(String.valueOf(aChar)), length);
        }
        return result == a;
    }

    static boolean isArmstrongOptimalSolution(int a){
        int originalNumber = a;
        int sum = 0;
        int length = String.valueOf(a).length();
        while(a != 0){
            sum = sum + (int)Math.pow(a % 10, length);
            a = a/10;
        }
        return sum == originalNumber;
    }
}
