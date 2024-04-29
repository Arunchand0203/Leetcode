class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnValue = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            returnValue.add(generateRows(i));
        }
        return returnValue;
    }

    public static List<Integer> generateRows(int row){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long value = 1;
        for(int col = 1; col < row; col++){
            value = value * (row - col);
            value = (value/(col));
            ans.add((int)value);
        }
        return ans;
    }
}