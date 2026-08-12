// Last updated: 8/12/2026, 9:20:03 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> pmap=new HashMap<>();
        for(char ch:s1.toCharArray()){
             pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }

        for(int right=0;right<s2.length();right++){
            char ch=s2.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(right-left+1>s1.length()){
                 char remove=s2.charAt(left);
                 map.put(remove,map.getOrDefault(remove,0)-1);

                if(map.get(remove)==0)
                map.remove(remove);

                left++;
            }
            

              if(map.equals(pmap))
              return true;
        }
        return false;
    }
}