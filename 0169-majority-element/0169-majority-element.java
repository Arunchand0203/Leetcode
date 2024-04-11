class Solution {
    public int majorityElement(int[] nums) {
       
        int counter = 0;

        int element = 0;

        for(int i = 0; i < nums.length; i++){
            if(counter == 0){
                counter = 1;
                element = nums[i];
            }else if(nums[i] == element){
                counter++;
            }else{
                counter--;
            }
        }
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                cnt++;
            }
        }

        if(cnt > (nums.length/2)){
            return element;
        }

        return -1;

    }
}