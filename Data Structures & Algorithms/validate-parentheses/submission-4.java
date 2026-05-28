class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); 
        for (Character c : s.toCharArray()) { 
            if (c == '(' || c== '{' || c == '[') { 
                st.push(c); 
            } else {
                if (st.empty()) { 
                    return false;
                }
                Character peek = st.peek(); 
                if ((c == ')' && peek == '(') || (c == '}' && peek == '{') || (c == ']' && peek == '[')) { 
                    st.pop(); 
                } else { 
                    return false; 
                }
            }
        }
        if (st.empty()) { 
            return true;
        } else { 
            return false;
        }
        
    }
}
