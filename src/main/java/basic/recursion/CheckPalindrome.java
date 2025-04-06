package basic.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println(checkPalindrome(input, 0, input.length()-1));
    }

    static boolean checkPalindrome(String input, int start, int end){
        if(input.charAt(start) != input.charAt(end)) return false;
        if(start >= end) return true;
        return checkPalindrome(input, ++start, --end);
    }
}
