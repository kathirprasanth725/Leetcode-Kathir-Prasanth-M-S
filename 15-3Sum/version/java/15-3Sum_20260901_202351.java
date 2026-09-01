// Last updated: 9/1/2026, 8:23:51 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3       Set<List<Integer>> set=new HashSet<>();
4       Arrays.sort(nums);
5
6       for(int l=0;l<nums.length-2;l++){
7            int r=l+1;
8            int k=nums.length-1;
9        while(r<k){
10            int sum=nums[l]+nums[r]+nums[k];
11            if(sum<0){
12                r++;
13            }
14
15          else if(sum==0){
16                set.add(Arrays.asList(nums[l],nums[r],nums[k]));
17                r++;
18                k--;
19            }
20
21            else{ k--;
22            }
23        }
24       }
25return new ArrayList<>(set);
26    }
27}