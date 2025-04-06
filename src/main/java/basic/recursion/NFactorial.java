package basic.recursion;

public class NFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int n){
        if(n < 1) return 1; // return 1, because anything multiplied by 0 is 0;
        return n * factorial(n - 1);
    }
}
