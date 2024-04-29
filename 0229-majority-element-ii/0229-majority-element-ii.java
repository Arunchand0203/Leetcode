class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> data = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(data.containsKey(nums[i])){
                data.put(nums[i], data.get(nums[i])+1);
            }else{
                data.put(nums[i], 1);
            }
        }
        int value = nums.length/3;
        for(Integer eachKey : data.keySet()){
            if(data.get(eachKey) > value){
                resultList.add(eachKey);
            }
        }
    return resultList;
    }
}