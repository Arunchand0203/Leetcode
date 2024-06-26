class Solution {

    public int process(int[] a, int m){
        int cnt = 0;
        for(int i = 0; i < a.length; i++){
            cnt = cnt +  (int)Math.ceil((double)(a[i]) / (double)(m));
        }

        return cnt;
    }


    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low+high)/2;
            int addedData = process(nums,mid);

            if(addedData <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }    

        return ans;
    }
}