class Solution {
    public void reverseArray(int[] nums,int i,int j){
        while(j>i){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return ;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            // reverse the whole array:
            reverseArray(nums,0,nums.length-1);
            return ;
        }

        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverseArray(nums, ind+1, nums.length - 1);
        return;
    }

}