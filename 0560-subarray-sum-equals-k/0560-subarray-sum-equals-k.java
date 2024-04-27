class Solution {
    public int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);

        for(int i = 0; i< nums.length; i++){
            prefixSum = prefixSum + nums[i];
            int left = prefixSum - k;
            count = count + prefixMap.getOrDefault(left, 0);
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
            
        }

        return count;
        
    }
}