// Last updated: 9/11/2026, 9:31:57 AM
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;

        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
           int a=h*w;
           ans=Math.max(ans,a);
           if(height[l]<height[r]){
            l++;
           }
           else
           r--;

        }
        return ans;
    }
}