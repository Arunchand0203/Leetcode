class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        int buf = nums.length / 3;

        for(int i = 0; i< nums.length; i++){
            if((cnt1 == 0 )&& (el2 != nums[i])){
                cnt1 = 1;
                el1 = nums[i];
            }else if(cnt2 == 0 && el1 != nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }else if(el1 == nums[i]){
                cnt1++;
            }else if(el2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
    int cntr1 = 0;
    int cntr2 = 0;
    for(int i = 0; i< nums.length; i++){
        if(el1 == nums[i]){
            cntr1++;
        }else if(el2 == nums[i]){
            cntr2++;
        }
    }
    List<Integer> result = new ArrayList<>();
    if(cntr1 > buf){
        result.add(el1);
    }

    if(cntr2 > buf){
        result.add(el2);
    }

return result;

    }
}