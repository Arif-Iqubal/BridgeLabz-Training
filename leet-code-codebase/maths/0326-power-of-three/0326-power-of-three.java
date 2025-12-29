class Solution {
    public boolean isPowerOfThree(int number) {
           if(number==1){
            return true;
        }
        while(number>1){
            if(number%3==0){
                number /= 3;
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