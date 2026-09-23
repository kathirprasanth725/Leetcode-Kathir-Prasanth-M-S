// Last updated: 9/23/2026, 9:51:17 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3    int arr[]=new int[gain.length+1];
4    arr[0]=0;
5    int sum=0;
6    int max=Integer.MIN_VALUE;
7    for(int i=1;i<arr.length;i++){
8       arr[i]=arr[i-1]+gain[i-1];
9
10       if(arr[i]>max){
11        max=arr[i];
12       }
13    }
14    if(arr[0]>max){
15        max=arr[0];
16    }
17    return max;
18    }
19}