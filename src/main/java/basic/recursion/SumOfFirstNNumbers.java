package basic.recursion;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(0, 10));
        System.out.println(sumOfNNumbersOptimalWay(10));
    }

    static int sumOfNNumbers(int sum, int n){
        if(n < 1){
            return sum;
        }
        sum = sum + n; // sum = 0+5 = 5 -> 5 + 4 = 9 -> 9 + 3 = 12 -> 12 + 2 = 14 -> 14 + 1 = 15 -> not reachable (because i is less than 1) and base condition is achieved
        return sumOfNNumbers(sum, n-1);
    }

    static int sumOfNNumbersOptimalWay(int n){
        if(n < 1) return 0;

        // Each recursive call waits for the result of sumOfNNumbersOptimalWay(n - 1)
        // The calls build up on the stack as:
        // sumOfNNumbersOptimalWay(5) → sumOfNNumbersOptimalWay(4) → ... → sumOfNNumbersOptimalWay(1)
        // Once the base case (n < 1) returns 0, the stack starts to unwind:
        // 1 + 0 → 2 + 1 → 3 + 3 → ... → final sum
        return n + sumOfNNumbersOptimalWay(n - 1);
    }

}
