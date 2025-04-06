package basic.maths;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrongBruteForce(371));
        System.out.println(isArmstrongOptimalSolution(371));
    }

    // Time complexity is O(log n)
    // for loops runs on the number of digits in number, the number of digits in number is proportional to log10(a)
    // In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.
    static boolean isArmstrongBruteForce(int a){
        char[] chars = String.valueOf(a).toCharArray();
        int length = chars.length;
        int result = 0;

        for(char aChar: chars){
            result = result + (int) Math.pow(Integer.parseInt(String.valueOf(aChar)), length);
        }
        return result == a;
    }

    // Time complexity is same as above
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
