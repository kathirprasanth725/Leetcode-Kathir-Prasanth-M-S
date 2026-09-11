// Last updated: 9/11/2026, 9:28:21 AM
class Solution {
    public int totalFruit(int[] fruits) {
    int l=0;
    int max=Integer.MIN_VALUE;
    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int i=0;i<fruits.length;i++){
     hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);

        int count=0;
    while(hm.size()>2){
        hm.put(fruits[l],hm.get(fruits[l])-1);

        if(hm.get(fruits[l])==0){
            hm.remove(fruits[l]);
        }
        l++;
    }
    count+=i-l+1;
    max=Math.max(max,count);

    }

    return max;
    }
}