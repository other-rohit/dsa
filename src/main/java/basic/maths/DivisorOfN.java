package basic.maths;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorOfN {
    public static void main(String[] args) {
        printDivisorOfNBruteForce(36);
        System.out.println(divisorOnN(36));
    }

    static void printDivisorOfNBruteForce(int n){
        int a = 1;
        while (a <= n){
            if(n % a == 0){
                System.out.println(a);
            }
            a++;
        }
    }

    static ArrayList<Integer> divisorOnN(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) { // because not to add the perfect sqrt twice in the array, alternative is to use set.
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
