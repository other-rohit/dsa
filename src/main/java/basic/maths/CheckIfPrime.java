package basic.maths;

import java.util.ArrayList;

public class CheckIfPrime {
    public static void main(String[] args) {
        System.out.println(isPrimeBruteForce(49));
        System.out.println(isPrimeOptimal(49));
    }

    // The flaw in this approach is:
    // it will calculate ALL the divisors, even if we know that 2 divisor are enough for condition to be true
    static boolean isPrimeBruteForce(int n){

        ArrayList<Integer> numberOfDivisor = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++){
            if(n % i == 0){
                numberOfDivisor.add(i);
                if(n / i != i){
                    numberOfDivisor.add(n / i);
                }
            }
        }

        return numberOfDivisor.size() == 2;
    }

    static boolean isPrimeOptimal(int n){

        int count = 0;

        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++){
            if(n % i == 0){
                count++;
                if(n / i != i){ // if not a perfect square, count the reciprocal factor
                    count++;
                }
            }
            if(count > 2) return false;
        }

        return true;
    }
}
