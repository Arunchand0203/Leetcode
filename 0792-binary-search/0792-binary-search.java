class Solution {

    public int reBs(int[] nums, int low, int high, int target){
        if(low > high) return -1;
        int mid = (low + high)/2;
        if(nums[mid] > target){
            return  reBs(nums, low, mid -1, target);
        }else if(nums[mid] < target){
            return reBs(nums, mid + 1, high, target);
        }else {
            return  mid;
        }
    }

    public int search(int[] nums, int target) {
        return reBs(nums, 0, nums.length -1, target);
    }
}