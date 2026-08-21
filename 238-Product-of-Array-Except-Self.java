class Solution {
    public int[] productExceptSelf(int[] nums) {
        // use prefix and suffix products
        int prefixProd[] = new int[nums.length];
        int suffixProd[] = new int[nums.length];
        int res[] = new int[nums.length];
        prefixProd[0]=1;
        //prefix Subarray
        for(int i=1;i<nums.length;i++){
            prefixProd[i] = prefixProd[i-1] * nums[i-1];
        }
        //suffix Subarray
        suffixProd[nums.length-1] = 1;
        for(int j=nums.length-2;j>=0;j--){
            suffixProd[j] = suffixProd[j+1] * nums[j+1];
        }

        for(int i=0;i<nums.length;i++){
            res[i] = prefixProd[i] * suffixProd[i];
        }
        return res;
    }
}