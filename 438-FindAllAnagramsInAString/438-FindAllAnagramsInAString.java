// Last updated: 8/12/2026, 9:20:21 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    HashMap<Character,Integer> map=new HashMap<>();
    HashMap<Character,Integer> pmap=new HashMap<>();
    int left=0;
    ArrayList<Integer> ans=new ArrayList<>();
    for(char ch: p.toCharArray()){
        pmap.put(ch,pmap.getOrDefault(ch,0)+1);
    }
    for(int right=0;right<s.length();right++){
       char ch=s.charAt(right);
       map.put(ch,map.getOrDefault(ch,0)+1);
       
       if(right-left+1>p.length()){
          char remove=s.charAt(left);
         map.put(remove,map.getOrDefault(remove,0)-1);

         if(map.get(remove)==0)
         map.remove(remove);

         
          left++;
       }
        if(map.equals(pmap)){
           ans.add(left);
        }
       
    }



return ans;
    }
}