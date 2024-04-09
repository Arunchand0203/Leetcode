class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] finalArray = new int[2];
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
           int rem = target - nums[i];
           if(mpp.get(rem) != null){
                finalArray[0] = mpp.get(rem);
                finalArray[1] = i;

           }else{
            mpp.put(nums[i], i);
           }
        }
    return finalArray;

    }
}