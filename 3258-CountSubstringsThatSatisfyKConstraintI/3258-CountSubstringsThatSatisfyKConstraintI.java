// Last updated: 9/11/2026, 9:23:37 AM
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
      int count=0;
      int l=0;
      HashMap<Character,Integer> hm=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
      
        while( hm.getOrDefault('0',0)>k && hm.getOrDefault('1',0)>k ){
             char ch1=s.charAt(l);
             hm.put(ch1,hm.get(ch1)-1);
             
            if(hm.get(ch1) == 0){
                hm.remove(ch1);
            }
         l++;
        }
        count+=i-l+1;
      }   
      return count;
    }
}