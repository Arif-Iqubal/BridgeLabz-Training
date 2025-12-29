class Solution {
    public boolean isPalindrome(int number) {
        //Revering the given number
        int originalNumber = number;
        int reversedNumber = 0;
        while(number != 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if((reversedNumber == originalNumber) && originalNumber>=0){
            return true;
        }
        else{
            return false;
        }
    }
}