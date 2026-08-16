class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums.length==1)return nums[0];
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[r]){
                l=mid+1;
            }
            else{
                r=mid; // as it checks (nums[mid] <=nums[r]) so mid could be min
            }
        }
        return nums[l];
    }
}