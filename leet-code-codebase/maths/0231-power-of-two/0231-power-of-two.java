class Solution {
    public boolean isPowerOfTwo(int number) {
        if(number==1){
            return true;
        }
        while(number>1){
            if(number%2==0){
                number /= 2;
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