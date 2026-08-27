// Last updated: 8/27/2026, 10:30:07 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0;
4        int r=numbers.length-1;
5
6        while(l<r){
7            if(numbers[l]+numbers[r]>target){
8                r--;
9            }
10            else if(numbers[l]+numbers[r]==target){
11                return new int[]{l+1,r+1};
12            }
13
14            else l++;
15        }
16        return new int[]{-1,-1};
17    }
18}