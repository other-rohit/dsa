package basic.recursion;

public class PrintProblems {

    public static void main(String[] args) {
        printNTimes("Rohit", 10);
        print1toN(9, 1);
        printNto1(10);
    }

    static void printNTimes(String message, int n){
        if(n < 1){
            return;
        }
        System.out.println(message);
        printNTimes(message, n -1);
    }

    static void print1toN(int n, int counter){
        if(counter > n){
            return;
        }
        System.out.println(counter);
        print1toN(n, counter+1);
    }

    static void printNto1(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}
