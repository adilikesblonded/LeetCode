1class Solution {
2    String roman(int num,int mult){
3        if(num==0)return "";
4        if(num==1000){
5            String s="";
6            for(int i=1;i<=mult;i++)
7                s+="M";
8            return s;
9        }
10        if(num==100){
11            if(mult==4) return "CD";
12            else if(mult==9) return "CM";
13            else if(mult==5) return "D";
14            else if(mult>5&&mult<9){
15                String s="D";
16                for(int i=1;i<=(mult-5);i++)
17                    s+="C";
18                return s;
19            }
20            else if(mult<4){
21                String s="";
22                for(int i=1;i<=mult;i++)
23                    s+="C";
24                return s;
25            }
26        }
27        if(num==10){
28            if(mult==9) return "XC";
29            else if(mult==5) return "L";
30            else if(mult==4){
31                return "XL";
32            }
33            else if(mult>5 && mult<9){
34                String s="L";
35                for(int i=1;i<=(mult-5);i++)
36                    s+="X";
37                return s;
38            }
39            else if(mult<4){
40                String s="";
41                for(int i=1;i<=mult;i++)
42                    s+="X";
43                return s;
44            }
45        }
46        if(num==1){
47             if(mult==5)
48                return "V";
49            else if(mult==4) return "IV";
50            else if(mult==9)
51                 return "IX";
52            else if(mult>5&&mult<9){
53                 String s="V";
54                for(int i=0;i<(mult-5);i++){
55                    s+="I";
56                }
57                return s;
58             }
59            else if(mult<4){
60                String s="";
61                for(int i=0;i<(mult);i++){
62                    s+="I";
63                }
64                return s;
65            }
66        }
67        return "";
68    }
69    public String intToRoman(int num) {
70        int n=num;int q;String s="";
71            q=n/1000;
72            s+=roman(1000,q);
73            n=n%1000;
74            //
75            q=n/100;
76            s+=roman(100,q);
77            n=n%100;
78            //
79            q=n/10;
80            s+=roman(10,q);
81            n=n%10;
82            //
83            q=n;
84            s+=roman(1,q);
85        return s;
86    }
87}
88