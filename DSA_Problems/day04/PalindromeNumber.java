package day04;

public class PalindromeNumber {
    public static void main(String[] args) {
        int  x = 121;
    }
    public    boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        long rev = 0;

        int y = x;
        while(y > 0) {
            int remainder = y % 10;
            y /= 10;

            rev = rev * 10 + remainder;
        }

        if(rev > Integer.MAX_VALUE) {
            return false;
        }

        return ((int) rev) == x;
    }
}
