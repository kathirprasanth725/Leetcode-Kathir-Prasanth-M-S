// Last updated: 8/11/2026, 2:19:22 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int [] merging=new int[m+n]; 

       for(int i=0;i<m;i++){
        merging[i]=nums1[i];
       }
       for(int i=0;i<n;i++){
        merging[m+i]=nums2[i];
       }
       Arrays.sort(merging);

       for(int i=0;i<m+n;i++)
       nums1[i]=merging[i];
    }
}