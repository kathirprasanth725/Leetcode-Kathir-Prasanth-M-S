// Last updated: 11/7/2026, 9:04:28 PM
1class Solution {
2    public int[] countBits(int n) {
3    int arr[]=new int[n+1];
4
5    for(int i=0;i<arr.length;i++){
6        int x=i;
7        int count=0;
8        while(x>0){
9            int rem=x%2;
10
11            if(rem==1){
12                count++;
13            }
14
15            x=x/2;
16        }
17        arr[i]=count;
18    }
19    return arr;
20    }
21}