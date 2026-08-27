// Last updated: 8/27/2026, 2:59:18 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int ans=0;
6
7        while(l<r){
8            int h=Math.min(height[l],height[r]);
9            int w=r-l;
10        
11           int a=h*w;
12           ans=Math.max(ans,a);
13           if(height[l]<height[r]){
14            l++;
15           }
16           else
17           r--;
18
19        }
20        return ans;
21    }
22}