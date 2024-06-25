class Solution {

    public boolean process(int[] a, int h, int m, int k){
        int cnt = 0;
        int b = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] <= h){
                cnt++;
            }else{
                b = b + (cnt/k);
                cnt = 0;
            }

            
        }
        b = b + (cnt/k);
         if(b >= m){
                return true;
            } else{
                return false;
            }
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int ans = Integer.MAX_VALUE;
        if( (long) m * k > bloomDay.length){
            return -1;
        }else{
            int low = Arrays.stream(bloomDay).min().getAsInt();
            int high = Arrays.stream(bloomDay).max().getAsInt();

            while(low <= high){
                int mid = (low + high)/2;
                if(process(bloomDay, mid, m, k)){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            return ans;
        }
    }
}