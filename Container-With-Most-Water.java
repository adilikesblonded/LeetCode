1class Solution {
2    public int maxArea(int[] height) {
3        int max_area=0;
4        int right=height.length-1;
5        int left=0;
6        while(left<right){
7            int col=Math.min(height[left],height[right]);
8            int wid=right-left;
9            max_area=Math.max(max_area,col*wid);
10            if(height[left]>height[right]) right--;
11            else left++;
12        }
13        return max_area;
14    }
15}