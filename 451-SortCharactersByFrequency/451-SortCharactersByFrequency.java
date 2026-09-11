// Last updated: 9/11/2026, 9:29:59 AM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list=new ArrayList<>(hm.keySet());

        list.sort((a,b)->hm.get(b)-hm.get(a));

        StringBuilder ans=new StringBuilder();

        for(char ch:list){
                for(int i=0;i<hm.get(ch);i++){
                    ans.append(ch);
                }
        }
    return ans.toString();
    }
}