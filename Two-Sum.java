1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       int indicesarr[] = new int[2];
4        for(int i=0;i<nums.length;i++){
5            int k=i+1; 
6            while(k<nums.length){
7            if(nums[k]+nums[i]==target){
8                indicesarr[0]=i;
9                indicesarr[1]=k;
10                break;
11            }
12            k++;
13        }
14    }
15    if(indicesarr[0]>indicesarr[1]){
16        int temp=indicesarr[0];
17        indicesarr[0]=indicesarr[1];
18        indicesarr[1]=temp;
19    }
20        return indicesarr;
21    }
22}
23class MAIN{
24    public static void main(String[] args){
25        Solution A = new Solution();
26        int nums[] = {3,2,4};
27       int IndicesArr[]= A.twoSum(nums,6);
28       for(int i:IndicesArr){
29        System.out.print(i);
30       }
31    }
32}