class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        boolean flag = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[index] = nums[i];
                index++;
                flag = false;
            }
        }
        if(nums.length >= 2 && !flag){
            if(nums[index-1] != nums[nums.length-1]){
                nums[index] = nums[nums.length-1];
                index++;
            }
        }
        if(nums.length == 1 || flag) return 1;
       return index;
    }
}