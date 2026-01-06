1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n=nums.length;
5    List<List<Integer>> result = new ArrayList<>();
6    if(n<4) return result;
7    long minsum=(long)nums[0]+nums[1]+nums[2]+nums[3];
8    long maxsum=(long)nums[n-1]+nums[n-2]+nums[n-3]+nums[n-4];
9    if(target<minsum||target>maxsum)return result;
10    
11    for(int i=0;i<n-3;i++){//leave space for 4 elements
12        if(i>0&&nums[i]==nums[i-1])continue;
13        for(int j=i+1;j<n-2;j++){//leave space for 3 elements
14            if(j>i+1&&nums[j]==nums[j-1])continue;
15            List<Integer> list= new ArrayList<>();
16            long sum=(long)(target-nums[i]-nums[j]);
17            int left=j+1;//i<j<left<right
18            int right=n-1;
19            while(left<right){
20                long twosum= (long)nums[left]+nums[right];
21            if(twosum==sum){
22                list=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
23                result.add(list);
24                left++;
25                right--;
26                while(left<right && nums[left]==nums[left-1])left++;//skip duplicates
27                while(left<right && nums[right]==nums[right+1])right--;
28
29            }
30            else if(twosum<sum)left++;
31            else right--;
32        }
33        }
34    }
35    return result;
36}
37}