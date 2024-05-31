class Solution {
    public boolean isAnagram(String s, String t) {
       char[] charData1 = s.toCharArray();
       char[] charData2 = t.toCharArray();

       Arrays.sort(charData1);
       Arrays.sort(charData2);

       String s1 = new String(charData1);
       String s2 = new String(charData2);

        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}