// Last updated: 9/3/2026, 3:32:42 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> hm=new HashMap<>();
4        int arr[]=new int[k];
5        for(int i=0;i<nums.length;i++){
6            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
7        }
8        ArrayList<Integer> list=new ArrayList<>(hm.keySet());
9        list.sort((a,b)->hm.get(b)-hm.get(a));
10        for(int i=0;i<k;i++){
11           arr[i]=list.get(i);
12
13        }
14          return arr;  
15        }
16    }
17