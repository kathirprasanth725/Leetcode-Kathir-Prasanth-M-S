// Last updated: 9/13/2026, 9:25:28 AM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        n=grid.length;
4        for(int i=0;i<n;i++){
5            int  k=rowShift[i]%n;
6            int[] temp=new int[n];
7
8            for(int j=0;j<n;j++){
9                temp[j]=grid[i][(j+k)%n];
10            }
11            grid[i]=temp;
12        }
13
14        for(int j=0;j<n;j++){
15            int k=colShift[j]%n;
16            int[] temp=new int[n];
17
18            for(int i=0;i<n;i++){
19                temp[i]=grid[(i+k)%n][j];
20            }
21            for(int i=0;i<n;i++){
22                grid[i][j]=temp[i];
23            }
24        }
25        return grid;
26    }
27}