class Solution {

    public int process(int[] nums, int bs){
        int ks = 1;
        int data = 0;

        for(int i = 0; i< nums.length; i++){
            if((data + nums[i]) > bs){
                ks = ks + 1;
                data = nums[i];
            }else{
                data = data + nums[i];
            }
        }

        return ks;
    }

    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = (low + high)/2;
            int ks = process(nums,mid);

            if(ks > k){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        return low;
    }
}