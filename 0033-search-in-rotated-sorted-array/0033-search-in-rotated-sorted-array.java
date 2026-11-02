class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]==target){
                count = i;
                break;
            }else{
                count = -1;
            }
        }
        return count;
    }
}