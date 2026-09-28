// Last updated: 9/28/2026, 7:34:28 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3      int low=1;
4      int high=0;
5      for(int x:piles){
6        high=Math.max(high,x);
7      }  
8        int ans=high;
9      while(low<=high){
10        int mid=low+(high-low)/2;
11        
12        if(txt(piles,h,mid)){
13            ans=mid;
14            high=mid-1;
15        }
16        else{
17            low=mid+1;
18        }
19      }
20        return ans;
21    }
22
23      private boolean txt(int [] piles,int h,int k){
24        long hours=0;
25
26        for(int p:piles){
27            hours+=(p+k-1)/k;
28        }
29        return hours<=h;
30      
31    }
32}