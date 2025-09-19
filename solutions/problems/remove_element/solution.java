class Solution {
    public int removeElement(int[] nums, int val) {
       int n = 0;
        for(int j=0;j < nums.length ;j++){
            if(nums[j]!=val){
                nums[n] = nums[j];
                n++;
            }
        }
        return n;
    }
}