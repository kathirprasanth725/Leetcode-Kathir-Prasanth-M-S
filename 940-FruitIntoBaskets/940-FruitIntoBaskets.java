// Last updated: 8/12/2026, 9:19:43 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int max=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
        
            while(map.size()>2){
                int fruit=fruits[left];
                map.put(fruit,map.get(fruit)-1);

                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}