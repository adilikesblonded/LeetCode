class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        // equation used min(leftMax, rightMax) - height[i] (since height is limited by the minimum height)
        int trappedWater = 0;
        int leftMax = 0,rightMax = 0;

        while(start<end){
            leftMax = Math.max(leftMax,height[start]); // maximum of current and largest already found
            rightMax = Math.max(rightMax,height[end]);

            if(leftMax<rightMax){
                trappedWater += leftMax - height[start];
                start++;
            }
            else{
                trappedWater += rightMax - height[end];
                end--;
            }

        }
        return trappedWater;
    }
}