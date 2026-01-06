1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        /*Set<List<Integer>> set = new HashSet<>(); //a set is an unordered collection of elements 
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                for(int k=j+1;k<nums.length;k++){
7                    List<Integer> list = new ArrayList<>();
8                    if(i!=j && i!=k && j!=k && nums[i]+nums[j]+nums[k]==0){
9                    list.add(nums[i]);
10                    list.add(nums[j]);
11                    list.add(nums[k]);
12                    Collections.sort(list); //sorts in ascending order
13                    set.add(list);
14                    }
15                }
16            }
17        }//no duplicate elements appear in a set
18        return new ArrayList<>(set);//converts set to list*/
19
20        List<List<Integer>> flist = new ArrayList<>();
21        Arrays.sort(nums); //sorts the array
22        for(int i=0;i<nums.length;i++){
23            if(i>0 && nums[i]==nums[i-1]) continue; //skip duplicates
24            int left=i+1; 
25            int right=nums.length-1;
26            while(left<right){
27                List<Integer> list = new ArrayList<>();
28                int sum=nums[i]+nums[left]+nums[right];
29                if(sum==0){
30                    list.add(nums[i]);
31                    list.add(nums[left]);
32                    list.add(nums[right]);
33                    flist.add(list);
34
35                    while(left<right && nums[left] == nums[left+1]) left++;//skip duplicates from left and right
36                    while(left<right && nums[right] == nums[right-1]) right--;
37                    left++;
38                    right--;
39                }
40                else if(sum<0) left++; //since array is sorted it means the smaller elements are too small so move forward
41                else right--;
42            }
43        }
44        return flist;
45    }
46}