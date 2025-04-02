package basic.maths;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(-123400));
    }

    static int reverseNumber(int n ){
        int result = 0;
        while(n != 0){
            // number is multiplied by 10 to add additional zero
            result = result * 10 + n % 10;
            n /= 10;
        }
       return result;
    }

}
