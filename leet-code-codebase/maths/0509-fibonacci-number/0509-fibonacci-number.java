class Solution {
    public int fib(int n) {
        int curr = 1;
        int prev = 0;
        for(int i=1 ; i<n ; i++){
            int temp = curr + prev;
            prev = curr;
            curr = temp;
            
        }
        if(n==0) return 0;
        return curr;
    }
}