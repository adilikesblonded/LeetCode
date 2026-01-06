1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int closestsum=nums[0]+nums[1]+nums[2];
6        for(int i=0;i<n;i++){
7            int left=i+1;
8            int right=nums.length-1;
9            while(left<right){
10                int sum=nums[i]+nums[left]+nums[right];
11                if(Math.abs(target-sum)<Math.abs(target-closestsum)){
12                    closestsum=sum;
13                }
14                if(sum==target)return sum;
15                else if(sum<target)left++;
16                else right--;
17            }
18        }
19        return closestsum;
20    }
21}