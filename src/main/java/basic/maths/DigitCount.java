package basic.maths;

public class DigitCount {

    // Time complexity is O(1), because you are not iterating over anything
    static int digitCountOptimal(int n){
        if(n == 0) return 1;
        return (int) (Math.log10(Math.abs(n)) + 1);
        // log10 will give the power by which 10 should be raised to give the value
        // casted to int to remove the digits before the decimal
    }

    // Time Comp: O(log n)
    // In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
    static int digitCountUsingCounter(int n){
        if(n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while(n != 0){ // the last digit remaining when divided by 10 will make it 0
            count++;
            n /= 10; // this should result the quotient, which in case if divide by 10 will remove the last digit
        }
        return count;
    }

}
