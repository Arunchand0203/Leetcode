import java.util.ArrayList;

class Solution {


    public void merge(int[] nums, int l, int m, int h){
        List<Integer> data = new ArrayList<>();
        int left = l;
        int right = m+1;

        while(left <= m && right <= h){
            if(nums[left] < nums[right]){
                data.add(nums[left]);
                left++;
            }else{
                data.add(nums[right]);
                right++;
            }
        }

        while(left <= m){
            data.add(nums[left]);
                left++;
        }

        while(right <= h){
            data.add(nums[right]);
                right++;
        }

        for(int i = l; i <= h; i++){
            nums[i] = data.get(i-l);
        }

    }

    public int countPairs(int[] nums, int l, int m, int h){
        int cnt = 0;
        int right = m+1;
        for(int i = l; i <= m; i++){
            while(right <= h && (long)nums[i] > (long)2*nums[right]){
                right++;
            }
            cnt = cnt + (right - (m + 1));
        }

        return cnt;
    }


    public int mergeSort(int[] nums, int l, int h){
        int cnt = 0;
        if(l == h ) return cnt;
        int mid = (l+h)/2;
        cnt = cnt + mergeSort(nums, l, mid);
        cnt = cnt + mergeSort(nums, mid+1, h);
        cnt = cnt + countPairs(nums, l ,mid, h);
         merge(nums, l,mid,h);

         return cnt;
    }


    public int reversePairs(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
        
    }
}