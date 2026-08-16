// Last updated: 8/16/2026, 9:14:46 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3     int ans=-1;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6            int x=drones[i][0];
7            int y=drones[i][1];
8            int range=drones[i][2];
9
10            int distance=Math.abs(x-target[0])+Math.abs(y-target[1]);
11
12            if(distance<=range){
13                if(distance<min){
14                    min=distance;
15                    ans=i;
16                }
17            }
18        }
19        return ans;
20    }
21}