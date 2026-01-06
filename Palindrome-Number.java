1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0)return false;
4        int rev=0,num=x;
5        while(num>0){
6            rev=(rev*10)+(num%10);
7            num/=10;
8        }
9        if(rev==x)return true;
10        return false;
11    }
12}