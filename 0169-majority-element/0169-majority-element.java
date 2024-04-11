class Solution {
    public int majorityElement(int[] nums) {
        
        int buffer = nums.length/2;

        Map<Integer, Integer> dataMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(dataMap.containsKey(nums[i])){
                int value = dataMap.get(nums[i]);
                value = value+1;
                dataMap.put(nums[i], value);
            }else{
                dataMap.put(nums[i], 1);
            }
        }



        for(int eachKey : dataMap.keySet()){
            if(dataMap.get(eachKey) > buffer){
                return eachKey;
            }
        }
    return -1;
    }
}