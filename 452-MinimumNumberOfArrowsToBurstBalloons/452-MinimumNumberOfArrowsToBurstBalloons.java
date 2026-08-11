// Last updated: 8/11/2026, 2:17:50 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        long end=Long.MIN_VALUE;
        for(int [] ballon:points){
            if(ballon[0]<=end)
            continue;
            else
            c++;
            end=ballon[1];
        }
        return c;
    }
}