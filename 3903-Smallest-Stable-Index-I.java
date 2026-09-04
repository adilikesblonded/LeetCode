class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minimum = Integer.MAX_VALUE; int loc = -1;
        for(int i=0;i<nums.length;i++){
            int maxInstability = findMax(nums,i);
            int minInstability = findMin(nums,i);
            int instability = maxInstability - minInstability;
            if(instability <= k){
                return i;
            }
        }
        return -1;
    }
    int findMax(int nums[],int i){
        int max=0;
        for(int j=0;j<=i;j++){
            max = nums[j]>max?nums[j]:max;
        }
        return max;
    }
    int findMin(int nums[],int i){
        int min=Integer.MAX_VALUE;
        for(int j=i;j<nums.length;j++){
            min = nums[j]<min?nums[j]:min;
        }
        return min;
    }
}