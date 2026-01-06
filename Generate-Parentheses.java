1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> list= new ArrayList<>();
4        backtrack(n,list,0,0,new StringBuilder());
5        return list;
6    }
7    void backtrack(int n,List<String> list,int open, int close, StringBuilder current){
8        int length=close+open;
9        if(length==2*n){//since the string can have one "(" and one ")" for each n
10            list.add(current.toString());
11            return;
12        }
13        if(open<n){
14            current.append("(");
15            backtrack(n,list,open+1,close,current);
16            current.deleteCharAt(current.length()-1);
17        }
18        if(close<open){
19            current.append(")");
20            backtrack(n,list,open,close+1,current);
21            current.deleteCharAt(current.length()-1);
22        }
23
24    }
25    
26    
27}