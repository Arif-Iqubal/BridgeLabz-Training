class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int sumFormula = (length * (length + 1)) / 2;
        return sumFormula - sum;
    }
}