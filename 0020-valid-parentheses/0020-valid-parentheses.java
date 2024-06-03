class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> stackData = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stackData.push(s.charAt(i));
            }else{
                if(stackData.empty()){
                    return false;
                }else{
                    char c = stackData.peek();
                   
                    if((s.charAt(i) == ')' && c == '(') ||
                       (s.charAt(i) == '}' && c == '{') ||
                       (s.charAt(i) == ']' && c == '[')){
                             stackData.pop();
                       }else{
                        return false;
                       }
                }
            }
        }

        if(stackData.empty()){
            return true;
        }else{
            return false;
        }

    }
}