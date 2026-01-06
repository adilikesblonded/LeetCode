1class Solution {
2    
3    public boolean isValid(String s) {
4        char stack[] = new char[s.length()];
5        int top=-1;
6        int n=s.length();
7        for(int i=0;i<n;i++){
8            char ch=s.charAt(i);
9            if(ch=='('||ch=='{'||ch=='['){
10                stack[++top]=ch;
11            }
12            else {
13                if(top<0) return false;
14                char popped=stack[top--];
15                if(popped=='('&& ch!=')') return false;
16                else if(popped=='['&& ch!=']') return false;
17                else if(popped=='{' && ch!='}') return false;
18            }
19        }
20        if(top==-1) return true;
21        return false;
22    }
23}