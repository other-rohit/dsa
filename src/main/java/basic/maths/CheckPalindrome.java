package basic.maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("141"));
    }

    static boolean isPalindrome(String input){
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = cleanInput.toCharArray();
        for(int i = 0, j = input.length()-1; i<j; i++, j--){
            if(chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }
}
