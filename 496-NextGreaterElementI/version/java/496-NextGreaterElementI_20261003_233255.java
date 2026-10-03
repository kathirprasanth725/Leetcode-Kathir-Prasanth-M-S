// Last updated: 10/3/2026, 11:32:55 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3    HashMap<Integer,Integer> hm=new HashMap<>();
4    Stack <Integer> st=new Stack<>();
5
6    for(int i=0;i<nums2.length;i++){
7        while(!st.isEmpty() && nums2[i]>st.peek()){
8            hm.put(st.pop(),nums2[i]);
9        }
10        st.push(nums2[i]);
11    } 
12    while(!st.isEmpty()){
13        hm.put(st.pop(),-1);
14    }
15    int ans[]=new int[nums1.length];
16    for(int i=0;i<ans.length;i++){
17        ans[i]=hm.get(nums1[i]);
18    }
19    return ans;
20    }
21}