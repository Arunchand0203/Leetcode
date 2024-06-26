class Solution {

    public int process(int[] w, int c){
        int d = 1;
        int load = 0;

        for(int i = 0; i < w.length; i++){
            if(load + w[i] > c){
                d = d + 1;
                load = w[i];
            }else{
                load = load + w[i];
            }
        }

        return d;
    }


    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low <= high){
            int mid = (low + high)/2;
            int d = process(weights, mid);

            if(d <=  days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return low;


    }
}