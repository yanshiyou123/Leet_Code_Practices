/*
Palindrome Number:
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
*/
class Palindrome {
    public static boolean isPalindrome(int x) {
        
        int num = x;
        if (num < 0) {
            return false;
        }
        int remainder;
        int reversed = 0;
        while(x != 0){
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;
        
        }
        if(num == reversed){
            return true;
        }else{
            return false;
        }
            
    }

    public static void main(String args[]){
        isPalindrome(121);
        isPalindrome(-323);
        isPalindrome(567);
        
    }

}
