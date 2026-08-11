// Last updated: 8/11/2026, 2:16:03 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold)
        count++;

        for(int i=k;i<arr.length;i++){
          sum=sum-arr[i-k]+arr[i];
          if(sum/k>=threshold)
          count++;
        }
        return count;
    }
}