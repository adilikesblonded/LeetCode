1class Solution {
2    public int reverse(int x) {
3        if(x==0)return 0;
4        int num=Math.abs(x);
5        long rev=0;//you cannot check for overflow outside loop if the number is int
6        while(num>0){
7            rev=(rev*10)+(num%10);
8            num/=10;
9        }
10        rev=x<0?-rev:rev;
11        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)return 0;
12        return (int)rev;
13    }
14}