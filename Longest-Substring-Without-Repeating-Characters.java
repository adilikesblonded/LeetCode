1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int max=0;
4        int len=s.length();
5        for(int i=0;i<len;i++){
6            int seen[]=new int[256];
7            for(int j=i;j<len;j++){
8                char c=s.charAt(j);
9                if(seen[c]==1)break;
10                seen[c]=1;
11                if(max<(j-i+1))//j-i+1 gives length of substring
12                    max=j-i+1;
13            }
14        }
15        
16        return max;
17    }
18}