// Last updated: 8/16/2026, 9:17:33 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3   int max=0;
4        for(int light:lights)
5            max=Math.max(max,light);
6
7        int ans=0;
8        for(int time:arrivalTime){
9            int r=time%period;
10            int wait;
11            if(r<max){
12                wait=0;
13            }
14            else{
15                wait=period-r;
16            }
17            ans=Math.max(ans,wait);
18        }
19        return ans;
20    }
21}