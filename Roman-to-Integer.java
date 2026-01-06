1class Solution {
2    
3    public int romanToInt(String s) {
4        int n=s.length();
5        int sum=0;
6        for(int i=0;i<n;i++){
7            char ch=s.charAt(i);
8            char ch1=(i+1<n)?s.charAt(i+1):' ';
9            if(ch=='M')sum+=1000;
10            else if(ch=='D')sum+=500;
11            else if(ch=='C'&&ch1=='M'){sum+=900;i++;}
12            else if(ch=='C'&&ch1=='D'){sum+=400;i++;}
13            else if(ch=='C')sum+=100;
14            else if(ch=='L')sum+=50;
15            else if(ch=='X'&&ch1=='L'){sum+=40;i++;}
16            else if(ch=='X'&&ch1=='C'){sum+=90;i++;}
17            else if(ch=='X')sum+=10;
18            else if(ch=='I'&&ch1=='X'){sum+=9;i++;}
19            else if(ch=='I'&&ch1=='V'){sum+=4;i++;}
20            else if(ch=='V')sum+=5;
21            else if(ch=='I')sum+=1;
22        }
23    return sum;
24    }
25}