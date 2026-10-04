class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')s1.push(i);
            else if(s.charAt(i)=='*')s2.push(i);        
            else
            {
                if(!s1.isEmpty())s1.pop();
                else if(!s2.isEmpty())s2.pop();
                else return false;
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty())
            if(s1.pop()>s2.pop())return false;
        return s1.isEmpty();
    }
}