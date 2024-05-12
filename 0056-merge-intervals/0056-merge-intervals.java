class Solution {
    public int[][] merge(int[][] intervals) {

        int size = intervals.length;
        int cols = intervals[0].length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
       });

      
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            // If the current interval overlaps with the previous one, merge them
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                // If there's no overlap, add the current interval to the result
                merged.add(currentInterval);
                currentInterval = interval;
            }
        }
        // Add the last merged interval
        merged.add(currentInterval);

        return merged.toArray(new int[merged.size()][]);
    }
        
    }
