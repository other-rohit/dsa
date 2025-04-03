package basic.maths;

import java.util.ArrayList;
import java.util.List;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcdUsingBruteForce(20, 15));
        System.out.println(gcdUsingBetterApproach(20, 15));
        System.out.println(gcdUsingEuclideanAlgorithm(20, 15));
    }

    static int gcdUsingBruteForce(int a, int b){
        int gcd = 1;
        int counter = 1;
        while(counter < a || counter < b ){
            if(a % counter == 0 && b % counter == 0){
                gcd = counter;
            }
            counter++;
        }

        return gcd;
    }

    static int gcdUsingBetterApproach(int a, int b){
        // Handle input paramters
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) return b;
        if (b == 0) return a;

        int min = Math.min(a, b);

        for (int counter = min; counter >= 1; counter--) { // Start from min
            if (a % counter == 0 && b % counter == 0) {
                return counter;
            }
        }
        return 1; // added fallback value
    }

    static int gcdUsingEuclideanAlgorithm(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;

        if(a < b){
            b = b -a;
        } else {
            a = a -b;
        }

        return gcdUsingEuclideanAlgorithm(a, b);

    }
}
