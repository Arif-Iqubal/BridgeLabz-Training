class Solution {
    public boolean isPowerOfFour(int number) {
           if(number==1){
            return true;
        }
        while(number>1){
            if(number%4==0){
                number /= 4;
                if(number==1){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
}