class Solution {
    public String removeOuterParentheses(String s) {
       Stack<Character> data = new Stack<>();
		StringBuilder output = new StringBuilder();
		int tempNum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(i == 0) {
				data.push(s.charAt(i));
			}else {
				
				if(data.isEmpty()) {
					output = output.append(s.substring(tempNum+1, i-1));
					tempNum = i;
					data.push(s.charAt(i));
				}else {
					char temp = data.peek();
					if(Character.compare(temp, s.charAt(i)) == 0) {
						data.push(s.charAt(i));
					}else {
						data.pop();
					}
				}
				
			}
			
			
		}

		output = output.append(s.substring(tempNum+1, s.length()-1));
        return output.toString();
    }
}