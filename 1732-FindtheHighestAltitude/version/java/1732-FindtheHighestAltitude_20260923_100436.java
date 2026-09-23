// Last updated: 9/23/2026, 10:04:36 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3    int arr[]=new int[gain.length+1];
4    arr[0]=0;
5    int max=Integer.MIN_VALUE;
6    for(int i=1;i<arr.length;i++){
7       arr[i]=arr[i-1]+gain[i-1];
8
9       if(arr[i]>max){
10        max=arr[i];
11       }
12    }
13    if(arr[0]>max){
14        max=arr[0];
15    }
16    return max;
17    }
18}