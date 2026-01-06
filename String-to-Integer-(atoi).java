1class Solution {
2    public int myAtoi(String s) {
3        if(s==null||s.length()==0)return 0;
4        s=s.trim();
5        if(s.length()==0)return 0;
6        boolean flag=false;String num="";int i=0;
7        if(s.charAt(0)=='-'){
8            flag=true;
9            i++;
10        }
11        else if(s.charAt(0)=='+') i++;
12        while(i<s.length()&&Character.isDigit(s.charAt(i))){
13              num+=s.charAt(i);
14              i++;
15        }
16        if(num.length()==0)return 0;
17        int val=0;
18        try{
19            val=Integer.parseInt(num);
20        }catch(NumberFormatException e){
21            return flag?Integer.MIN_VALUE:Integer.MAX_VALUE;
22        }
23        return flag?-val:val;
24
25    }
26}