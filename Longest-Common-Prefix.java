1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder prefix = new StringBuilder();
4        for(int i=0;i<strs[0].length();i++){
5            char ch=strs[0].charAt(i);
6            for(int j=1;j<strs.length;j++){
7                if(i>=strs[j].length()||strs[j].charAt(i)!=ch)
8                    return prefix.toString();
9            }
10            prefix.append(ch);
11        }
12        return prefix.toString();
13    }
14}