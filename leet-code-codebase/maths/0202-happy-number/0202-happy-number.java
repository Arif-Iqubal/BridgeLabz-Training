class Solution {

    public boolean isHappy(int n) {
        int digitSquareSum = 0;
        Set <Integer> container = new HashSet<>();
        while(digitSquareSum != 1){
            digitSquareSum = 0;
            while(n!=0){
                int remainder = n%10;
                int product = remainder * remainder;
                digitSquareSum += product;
                n /= 10;
            }
            if(digitSquareSum == 1){
                return true;
            }
            
            if(container.contains(digitSquareSum)){
                return false;
            }
            container.add(digitSquareSum);
            n=digitSquareSum;

            
        }
        return true;
    }
}