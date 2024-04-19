class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j<n;j++){
                swap( matrix, i, j);
            }
        }

        for(int i = 0; i < n; i++){
                reverseArray(matrix[i]);
        }
    }



        public void swap(int[][] matrix, int i, int j){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end positions
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move start and end pointers towards the center
            start++;
            end--;
        }
    }

    
}