class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char k:s.toCharArray())
        {
            if (k=='('||k=='['||k=='{')st.push(k);
            else
            {
                if(st.isEmpty())return false;
                char c1=st.pop();
                if (k==')' && c1!='(') return false;
                else if (k==']' && c1!='[') return false;
                else if (k=='}' && c1!='{') return false;
            }
        }
        return st.isEmpty();
        
    }
}