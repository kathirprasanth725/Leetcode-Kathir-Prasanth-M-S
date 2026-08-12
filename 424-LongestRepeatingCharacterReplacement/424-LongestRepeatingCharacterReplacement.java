// Last updated: 8/12/2026, 9:20:27 PM
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
             char ch=s.charAt(right);
             map.put(ch,map.getOrDefault(ch,0)+1);
             maxfreq=Math.max(maxfreq,map.get(ch));

             while((right-left+1)-maxfreq>k){
               char remove=s.charAt(left);
               map.put(remove,map.get(remove)-1);
                left++;
             }
             max=Math.max(max,right-left+1);
        }
        return max;
    }
}