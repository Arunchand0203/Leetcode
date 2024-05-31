class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> data = new HashMap<>();



        for(int i = 0; i< strs.length; i++){
            char[] charData = strs[i].toCharArray();
            Arrays.sort(charData);
            String s = new String(charData);

            if(data.containsKey(s)){
                data.get(s).add(strs[i]);
            }else{
                List<String> input = new ArrayList<>();
                input.add(strs[i]);
                data.put(s, input);
            }}

            List<List<String>> finalData = new ArrayList<>();
            for(Map.Entry<String, List<String>> eachOne : data.entrySet()){
                finalData.add(eachOne.getValue());
            }

            return finalData;
    }
}