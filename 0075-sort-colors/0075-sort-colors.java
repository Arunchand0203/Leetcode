class Solution {
    public void sortColors(int[] nums) {
        
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                a = a+1;
            }else if(nums[i] == 1){
                b = b+1;
            }else if(nums[i] == 2){
                c = c+1;
            }
        }
        
        for( int i = 0; i <a; i++){
            nums[i] = 0;
        }
         for(int i = a; i <(a+b); i++){
            nums[i] = 1;
        }
         for(int  i = (a+b); i <(a+b+c); i++){
            nums[i] = 2;
        }

    }
}