class Solution {
    public long calTotalHrs(int[] piles, long m){
        long total = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++){
            total = total + (long)(Math.ceil((double)(piles[i])/(double)(m)));
        }

        return total;
    }


    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = Arrays.stream(piles).max().getAsInt();

        long ans = Integer.MAX_VALUE;

        while(low <= high){
            long mid = (low + high)/2;
            long totalHrs = calTotalHrs(piles,mid);

            if(totalHrs <= (long)h){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }

        }

        return (int)ans;
    }

    
}