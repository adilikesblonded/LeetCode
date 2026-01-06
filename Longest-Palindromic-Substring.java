1class Solution {
2    int expand(String s,int l,int r){
3        int n=s.length();
4        while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
5            l--;r++;
6        }
7        return (r-1)-(l+1)+1;//last correct palindrome was between (l+1)....(r-1);
8    }
9    public String longestPalindrome(String s) {
10        //Implement expand about centre method
11        int end=0;
12        int start=0;
13        int n=s.length();
14        for(int i=0;i<n-1;i++){
15            int l1=expand(s,i,i);//expand around odd centre
16            int l2=expand(s,i,i+1);//expand around even centre
17            int len=Math.max(l1,l2);
18            if(len>(end-start+1)){//length of prev palindrome
19                start=i-(len-1)/2;//since it is expanded around i start should be half length behind i the (len-1) ensures that this works for even and odd palidromes
20                end=i+(len)/2;//similarly end
21            }
22        }
23        return s.substring(start,end+1);//end+1 is null char
24        
25    }
26}