// Last updated: 8/27/2026, 3:07:54 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int ans=0;
6
7        while(l<r){
8            int h=Math.min(height[l],height[r]);
9            int w=r-l;
10           int a=h*w;
11           ans=Math.max(ans,a);
12           if(height[l]<height[r]){
13            l++;
14           }
15           else
16           r--;
17
18        }
19        return ans;
20    }
21}