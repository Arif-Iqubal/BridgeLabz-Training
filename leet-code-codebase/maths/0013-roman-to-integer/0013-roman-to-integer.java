class Solution {
    public int romanToInt(String s) {
        int number = 0;
        int digit = 0;
        int prev = 0;
        int length  = s.length();
        for(int i =0 ;i<length;i++){
            char temp = s.charAt(i);
            switch(temp){
                case 'I':{
                    digit = 1;
                    break;
                }
                case 'V':{
                    digit = 5;
                    break;
                }
                case 'X':{
                    digit = 10;
                    break;
                }
                case 'L':{
                    digit = 50;
                    break;
                }
                case 'C':{
                    digit = 100;
                    break;
                }
                case 'D':{
                    digit = 500;
                    break;
                }
                case 'M':{
                    digit = 1000;
                    break;
                }

            }
            if(digit<=prev){
                number += digit;
                prev = digit;
            }else{
                number = number + digit - 2 * prev;
                prev = digit;
            }
            

        }
        return number;
    }
}