// Last updated: 9/11/2026, 9:30:25 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(hm.keySet());
        list.sort((a,b)->hm.get(b)-hm.get(a));
        for(int i=0;i<k;i++){
           arr[i]=list.get(i);

        }
          return arr;  
        }
    }
